def algo(l1: str, l2: str):
    n = int(l1)
    sum1 = (n * (n + 1)) // 2
    sum2 = 0
    for x in l2.split(" "):
        if x != " ":
            sum2 += int(x)
    return sum1 - sum2


if __name__ == "__main__":
    l1 = input()
    l2 = input()
    print(algo(l1, l2))
