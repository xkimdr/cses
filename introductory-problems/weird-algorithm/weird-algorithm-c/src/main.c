#include <stdio.h>

int main(void)
{
    long n;
    scanf("%ld", &n);

    while (n != 1)
    {
        printf("%ld ", n);
        n = (n % 2 == 0) ? n >> 1 : n * 3 + 1;
    }

    printf("%ld\n", n);

    return 0;
}