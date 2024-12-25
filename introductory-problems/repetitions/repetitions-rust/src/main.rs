fn main() {
    let mut s = String::new();
    std::io::stdin().read_line(&mut s).unwrap();

    let mut m: u64 = 1;
    let mut i: u64 = 1;
    let mut pc: char = 'X';

    for c in s.trim().chars() {
        if c == pc {
            i += 1;
        } else {
            pc = c;
            m = std::cmp::max(m, i);
            i = 1;
        }
    }

    m = std::cmp::max(m, i);

    println!("{}", m);
}
