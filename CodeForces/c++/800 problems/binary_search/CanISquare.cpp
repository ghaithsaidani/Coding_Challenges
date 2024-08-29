#include <cmath>
#include <complex>
#include <iostream>

using namespace std;

int main()
{
    int t;cin >> t;

    while(t--)
    {
        int n;cin >> n;
        long long sum=0;
        while(n--)
        {
            long long x;cin >> x;
            sum+=x;
        }
        sqrt(sum) == static_cast<long long>(sqrt(sum)) ? cout << "YES" << endl : cout << "NO" << endl;
    }
    return 0;
}
