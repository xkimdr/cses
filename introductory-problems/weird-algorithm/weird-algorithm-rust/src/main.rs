fn main() {
    let mut s = String::new();
    std::io::stdin().read_line(&mut s).unwrap();

    let mut n: u64 = s.trim().parse().unwrap();

    while n != 1 {
        print!("{} ", n);
        n = if n % 2 == 0 { n / 2 } else { n * 3 + 1 };
    }

    println!("{}", n);
}
