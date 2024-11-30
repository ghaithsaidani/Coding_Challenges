#include <iostream>

using namespace std;

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int x, y, k;
        cin >> x >> y >> k;
        int result = (max(x, y) % k)!=0 ? (max(x, y) / k + 1) * 2 : ( max(x, y) / k ) * 2;
        x > y ? cout << result - 1 << endl : cout << result << endl;
    }
    return 0;
}
