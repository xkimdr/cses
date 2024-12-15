fn main() {
    let mut line1 = String::new();
    std::io::stdin().read_line(&mut line1).unwrap();

    let mut line2 = String::new();
    std::io::stdin().read_line(&mut line2).unwrap();

    let n = line1.trim().parse::<u64>().unwrap();
    let sum1 = (n * (n + 1)) / 2;

    let sum2: u64 = line2
        .trim()
        .split(" ")
        .map(|x| x.parse::<u64>().unwrap())
        .sum();

    println!("{}", sum1 - sum2);
}
