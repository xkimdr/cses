#include <iostream>

int main(void)
{
    long n{};
    std::cin >> n;

    while (n != 1)
    {
        std::cout << n << ' ';
        n = (n % 2 == 0) ? n >> 1 : n * 3 + 1;
    }

    std::cout << n << std::endl;

    return 0;
}