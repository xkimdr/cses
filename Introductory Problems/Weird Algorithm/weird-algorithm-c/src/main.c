#include <stdio.h>

void weird_algorithm(long n);

int main(void)
{
    long n;
    scanf("%ld", &n);

    weird_algorithm(n);

    return 0;
}

void weird_algorithm(long n)
{
    while (n != 1)
    {
        printf("%ld ", n);
        if (n % 2 == 0)
        {
            n = n / 2;
        }
        else
        {
            n = n * 3 + 1;
        }
    }
    printf("%ld\n", n);
}