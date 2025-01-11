def main():
    n = int(input())
    x = 0
    c = 0
    for i in input().split():
        y = int(i)
        if x > y:
            c += x - y
        else:
            x = y
    print(c)


if __name__ == "__main__":
    main()
