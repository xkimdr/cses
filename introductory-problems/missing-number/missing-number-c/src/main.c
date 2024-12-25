#include <stdio.h>

int main(void)
{
    long n;
    scanf("%ld", &n);

    long eS = (n * (n + 1)) >> 1;

    long aS = 0;
    for (long i = 0; i < n - 1; ++i)
    {
        long x;
        scanf("%ld", &x);
        aS += x;
    }

    printf("%ld\n", eS - aS);

    return 0;
}