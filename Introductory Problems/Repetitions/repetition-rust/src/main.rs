fn main() {
    let mut s = String::new();
    std::io::stdin().read_line(&mut s).unwrap();

    let mut max: u64 = 0;
    let mut count: u64 = 1;
    let mut pc = 'X';

    for c in s.chars() {
        if c == pc {
            count += 1;
        } else {
            pc = c;
            if count > max {
                max = count;
            }
            count = 1;
        }
    }

    println!("{}", max);
}
