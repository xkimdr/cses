const readline = require("readline")

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

const pI = l => {
    let c = 0
    let x = 0
    for (const i of l[1].split(" ")) {
        const y = parseInt(i)
        if (x > y) {
            c += x - y
        } else {
            x = y
        }
    }
    console.log(c);
}

const l = []

rl.on('line', line => {
    l.push(line.trim())
    if (l.length == 2) {
        rl.close()
        pI(l);
    }
})