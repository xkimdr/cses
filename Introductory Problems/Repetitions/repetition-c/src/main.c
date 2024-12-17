#include <stdio.h>

int main(void)
{
    int c;
    char pc = 'X';
    long m = 1;
    long n = 1;

    while ((c = getchar()) != '\n')
    {
        if ((char)c == pc)
        {
            ++n;
        }
        else
        {
            pc = (char)c;
            if (n > m)
            {
                m = n;
            }
            n = 1;
        }
    }

    if (n > m)
    {
        m = n;
    }

    printf("%ld\n", m);

    return 0;
}