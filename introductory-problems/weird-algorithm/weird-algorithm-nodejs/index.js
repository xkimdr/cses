const readline = require('readline')

const rl = readline.createInterface({
    input: process.stdin,
    output: process.output
})

const pI = n => {
    arr = []
    while (n != 1) {
        arr.push(n)
        n = (n % 2 == 0) ? n / 2 : n * 3 + 1
    }
    arr.push(n)
    console.log(arr.join(" "))
}

rl.on('line', line => {
    n = parseInt(line.trim())
    rl.close()
    pI(n)
})