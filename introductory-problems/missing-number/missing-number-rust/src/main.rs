fn main() {
    let mut l1 = String::new();
    std::io::stdin().read_line(&mut l1).unwrap();

    let mut l2 = String::new();
    std::io::stdin().read_line(&mut l2).unwrap();

    let n: u64 = l1.trim().parse().unwrap();

    let e = (n * (n + 1)) / 2;

    let a = l2
        .split_ascii_whitespace()
        .fold(0, |acc, x| acc + x.parse::<u64>().unwrap());

    println!("{}", e - a);
}
