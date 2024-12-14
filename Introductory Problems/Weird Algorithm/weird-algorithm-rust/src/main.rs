fn weird_algorithm(mut n: u64) {
    while n != 1 {
        print!("{} ", n);
        n = if n % 2 == 0 { n / 2 } else { n * 3 + 1 };
    }
    println!("{}", n);
}

fn main() {
    let mut n = String::new();

    std::io::stdin().read_line(&mut n).unwrap();

    let n = n.trim().parse::<u64>().unwrap();

    weird_algorithm(n);
}
