#include <iostream>

void algo(long n);

int main(void)
{
    long n{};
    std::cin >> n;

    algo(n);

    return 0;
}

void algo(long n)
{
    while (n != 1)
    {
        std::cout << n << ' ';
        if (n % 2 == 0)
        {
            n = n / 2;
        }
        else
        {
            n = n * 3 + 1;
        }
    }
    std::cout << n << std::endl;
}