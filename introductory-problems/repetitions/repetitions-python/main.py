def main():
    s = input()
    c = 1
    m = 1
    p = "X"
    for x in s:
        if x == p:
            c += 1
        else:
            if c > m:
                m = c
            p = x
            c = 1
    if c > m:
        m = c
    print(m)


if __name__ == "__main__":
    main()
