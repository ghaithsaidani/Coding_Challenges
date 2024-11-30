#include <iostream>

using namespace std;

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        long long l, r;
        cin >> l >> r;
        if (r == l)
        {
            cout << 1 << endl;
            continue;
        }
        long long sum = 0;
        for (int i = 1; i <= r - l; i++)
        {
            sum += i;
            if (sum <= (r - l) && sum + (i + 1) > (r - l))
            {
                cout << i + 1 << endl;
                break;
            }
        }
    }
    return 0;
}
