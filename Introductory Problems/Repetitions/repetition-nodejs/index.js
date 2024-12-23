const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const processInput = (string) => {
    let pc = 'X';
    let n = 1;
    let m = 1;

    for (const c of string) {
        if (c == pc) {
            ++n;
        } else {
            pc = c;
            m = Math.max(n, m);
            n = 1;
        }
    }

    m = Math.max(n, m);

    console.log(m);
};

rl.on('line', line => {
    processInput(line.trim());
    rl.close();
});