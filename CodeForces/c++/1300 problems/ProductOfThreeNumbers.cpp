#include <map>
#include <unordered_map>

#include "iostream"
#include "sstream"
#include "vector"
using namespace std;

static int isPrime(int x, int y)
{
    for (int i = y; i < x / 2; i++)
    {
        if (x % i == 0)
            return i;
    }
    return 0;
}

int main()
{
    int n;
    cin >> n;
    vector<pair<int, string>> result;
    for (int i = 0; i < n; i++)
    {
        int x;
        cin >> x;

        int first = isPrime(x, 2);

        if (first == 0)
        {
            result.emplace_back(x,"NO") ;
            continue;
        }
        int second = isPrime(x / first, first + 1);
        if (second == 0)
        {
            result.emplace_back(x,"NO") ;
            continue;
        }
        if ((x / (first * second)) == first || (x / (first * second)) == second)
        {
            result.emplace_back(x,"NO") ;
            continue;
        }
        ostringstream oss;
        oss << first << " " << second << " " << (x / (first * second));
        result.emplace_back(x,oss.str()) ;
    }

    for(const auto& elem : result)
    {
        if(elem.second == "NO")
        {
            cout << elem.second << endl;
        }
        else
        {
            cout << "YES" << "\n" << elem.second << endl;
        }

    }
    return 0;
}
