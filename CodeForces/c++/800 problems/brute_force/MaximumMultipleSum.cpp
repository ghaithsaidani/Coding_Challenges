#include <iostream>

using namespace std;

/*int sum(int n, int x, int x2)
{
    if (x2 <= n)
    {
        return sum(n, x, x2 + x) + x2;
    }
    return x2 - x2;
}*/

int main()
{
    int t;cin >> t;
    while (t--)
    {
        int n;cin >> n;
        if(n<4)
            cout << n << "\n";
        else cout << 2 << "\n";
    }

    return 0;
}
