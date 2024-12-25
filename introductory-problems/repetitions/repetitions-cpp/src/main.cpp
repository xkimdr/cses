#include <iostream>
#include <string>
#include <algorithm>

int main(void)
{
    std::string s{};
    std::getline(std::cin >> std::ws, s);

    char pc{'X'};

    long n{1};
    long m(1);

    for (char c : s)
    {
        if (c == pc)
        {
            ++n;
        }
        else
        {
            m = std::max(m, n);
            pc = c;
            n = 1;
        }
    }

    m = std::max(m, n);

    std::cout << m << std::endl;

    return 0;
}