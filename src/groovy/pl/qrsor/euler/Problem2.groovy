package pl.qrsor.euler

// Java style

class Fibonacci {
   def secondLast = 1
   def last = 1

   def next = {
      def temp = secondLast + last
      secondLast = last
      last = temp
   }
}

def sumOfEvens = { limit ->
   def sum = 0
   def current
   def fibonacci = new Fibonacci()
   while ((current = fibonacci.next()) < limit) {
      if (current % 2 == 0) {
         sum += current
         println "Limit: $limit. Current Fibonacci term: $current. Sum: $sum"
      }
   }

   return sum
}

assert sumOfEvens(4) == 2

println sumOfEvens(4_000_000)

def fib = {limit ->
   def fibonacci = [1, 2]

   while (fibonacci.last() < limit) {
      fibonacci << fibonacci[-2] + fibonacci[-1]
   }

   return fibonacci
}

def sum = { f-> f.findAll { it % 2 == 0 }.sum() }

assert 2 == sum(fib(4))
assert sum(fib(4_000_000)) == sumOfEvens(4_000_000)