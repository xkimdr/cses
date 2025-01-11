#include <iostream>
#include <string>
#include <sstream>

int main(void)
{
    long n{};
    std::cin >> n;

    std::string s{};
    std::getline(std::cin >> std::ws, s);

    std::istringstream iss{s};

    long c{};
    long x{};
    long y{};

    while (iss >> y)
    {
        if (x > y)
        {
            c += x - y;
            y = x;
        }

        x = y;
    }

    std::cout << c << '\n';

    return 0;
}