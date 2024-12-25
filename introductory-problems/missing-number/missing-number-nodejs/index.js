const readline = require('readline')

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

const pI = l => {
    const n = parseInt(l[0])
    const eS = (n * (n + 1)) / 2
    const aS = l[1].split(' ').reduce((acc, x) => acc + parseInt(x), 0)
    console.log(eS - aS)
}

const l = []

rl.on('line', line => {
    l.push(line.trim())
    if (l.length == 2) {
        rl.close()
        pI(l)
    }
})