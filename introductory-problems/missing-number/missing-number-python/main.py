def main():
    n = int(input())
    l = input().split()
    eS = (n * (n + 1)) // 2
    aS = sum(map(int, l))
    print(eS - aS)


if __name__ == "__main__":
    main()
