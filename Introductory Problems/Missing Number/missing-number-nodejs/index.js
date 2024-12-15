const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const processInput = (lines) => {
  const n = parseInt(lines[0]);
  const s1 = (n * (n + 1)) / 2;
  const s2 = lines[1].split(" ").reduce((sum, x) => sum + parseInt(x), 0);

  console.log(s1 - s2);
};

const lines = [];
let c = 0;
rl.on("line", (line) => {
  ++c;
  lines.push(line);

  if (c == 2) {
    rl.close();
    processInput(lines);
  }
});
