const readline = require('readline')

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

const pI = s => {
    let p = 'X'
    let m = 1
    let i = 1
    for (const c of s) {
        if (c == p) {
            ++i
        } else {
            m = Math.max(i, m)
            p = c
            i = 1
        }
    }
    m = Math.max(i, m)
    console.log(m)
}

rl.on('line', line => {
    const s = line.trim()
    rl.close()
    pI(s)
})