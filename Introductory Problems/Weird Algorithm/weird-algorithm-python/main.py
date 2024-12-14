def weird_algorithm(n: int):
    while n != 1:
        print(n, end=" ")
        if n % 2 == 0:
            n = n // 2
        else:
            n = n * 3 + 1
    print(n)


if __name__ == "__main__":
    n = int(input())
    weird_algorithm(n)
