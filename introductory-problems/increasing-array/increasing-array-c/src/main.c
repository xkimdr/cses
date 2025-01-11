#include <stdio.h>

int main(void)
{
    size_t n;
    scanf("%zu", &n);

    size_t x;
    scanf("%zu", &x);

    size_t c = 0;

    size_t y;
    for (size_t i = 1; i < n; i++)
    {
        scanf("%zu", &y);

        if (x > y)
        {
            c += x - y;
            y = x;
        }

        x = y;
    }

    printf("%zu\n", c);

    return 0;
}