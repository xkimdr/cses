#include <iostream>
#include <string>
#include <sstream>

int main(void)
{
    long n{};
    std::cin >> n;

    std::cin.ignore();

    long sum1{(n * (n + 1)) / 2};

    std::string line{};
    std::getline(std::cin, line);

    std::stringstream stream(line);

    long sum2{}, x{};
    while (stream >> x)
    {
        sum2 += x;
    }

    std::cout << sum1 - sum2 << std::endl;

    return 0;
}