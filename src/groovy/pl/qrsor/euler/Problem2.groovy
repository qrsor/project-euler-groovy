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