#include <iostream>
#include <string>
#include <sstream>

int main(void)
{
    long n{};
    std::cin >> n;

    long eS{(n * (n + 1)) >> 1};

    std::string s{};
    std::getline(std::cin >> std::ws, s);

    std::istringstream iss{s};

    long aS{};
    long x{};

    while (iss >> x)
    {
        aS += x;
    }

    std::cout << eS - aS << '\n';

    return 0;
}