package pl.qrsor.euler

def sum = 0
for (i in 1..9) {
    if (i % 3 == 0 || i % 5 == 0) {
        sum += i
    }
}

assert sum == 23

assert 23 == (1..9).sum { (it % 3 == 0 || it % 5 == 0) ? it : 0 }

assert 23 == (1..<10).findAll { it % 3 == 0 || it % 5 == 0 }.sum()

println ((1..<1000).findAll { it % 3 == 0 || it % 5 == 0 }.sum())