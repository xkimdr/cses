def main():
    string = input()
    pc = "X"
    c = 1
    m = 0
    for x in string:
        if x == pc:
            c += 1
        else:
            pc = x
            if c > m:
                m = c
            c = 1
    if c > m:
        m = c
    print(m)


if __name__ == "__main__":
    main()
