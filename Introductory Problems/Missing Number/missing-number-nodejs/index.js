const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const lines = [];

const processInput = (lines) => {
  const n = parseInt(lines[0], 10);
  const s1 = (n * (n + 1)) / 2;
  const s2 = lines[1].split(' ').reduce((acc, x) => acc + parseInt(x, 10), 0);
  console.log(s1 - s2);
};

rl.on('line', (line) => {
  lines.push(line.trim());

  if (lines.length === 2) {
    rl.close();
    processInput(lines);
  }
});
