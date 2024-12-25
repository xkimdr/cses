def main():
    l = []
    n = int(input())
    while n != 1:
        l.append(str(n))
        n = n // 2 if n % 2 == 0 else n * 3 + 1
    l.append(str(n))
    r = " ".join(l)
    print(r)


if __name__ == "__main__":
    main()
