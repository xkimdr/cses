fn main() {
    let mut s1 = String::new();
    std::io::stdin().read_line(&mut s1).unwrap();

    let mut s2 = String::new();
    std::io::stdin().read_line(&mut s2).unwrap();

    let mut c: u64 = 0;
    let mut x: u64 = 0;
    for i in s2.split_whitespace() {
        let y: u64 = i.parse().unwrap();
        if x > y {
            c += x - y;
        } else {
            x = y;
        }
    }

    println!("{}", c);
}
