#include <stdio.h>

int main(void)
{
    long n;
    scanf("%ld", &n);

    long sum1 = (n * (n + 1)) / 2;

    long x;
    long sum2 = 0;
    for (int i = 0; i < n - 1; ++i)
    {
        scanf("%ld", &x);
        sum2 += x;
    }

    printf("%ld\n", sum1 - sum2);

    return 0;
}
