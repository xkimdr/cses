process.stdin.resume();
process.stdin.setEncoding('utf-8');

process.stdin.on('data', (data) => {
  let n = data.trim();
  process.stdin.pause();

  const result = [];
  result.push(n);

  while (n != 1) {
    n = (n % 2 == 0) ? (n / 2) : (n * 3 + 1);
    result.push(n);
  }

  console.log(result.join(" "));
});