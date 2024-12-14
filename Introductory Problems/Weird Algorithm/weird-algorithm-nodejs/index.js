const readline = require("readline");

const input = () => {
  const r = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
  });

  return new Promise((resolve) => {
    r.question("", (x) => {
      r.close();
      resolve(x);
    });
  });
};

const algo = (n) => {
  const arr = [];
  while (n !== 1) {
    arr.push(n);
    n = n % 2 === 0 ? n / 2 : n * 3 + 1;
  }
  arr.push(1);
  return arr;
};

const main = async () => {
  const n = parseInt(await input());
  console.log(algo(n).join(" "));
};

main();
