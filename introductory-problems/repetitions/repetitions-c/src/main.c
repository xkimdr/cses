#include <stdio.h>

int main(void)
{
    int c, pc;
    long i, m;

    i = m = 1;
    pc = 'X';

    while ((c = getchar()) != '\n')
    {
        if (c != pc)
        {
            if (m < i)
            {
                m = i;
            }
            i = 1;
            pc = c;
        }
        else
        {
            ++i;
        }
    }

    if (m < i)
    {
        m = i;
    }

    printf("%ld\n", m);

    return 0;
}