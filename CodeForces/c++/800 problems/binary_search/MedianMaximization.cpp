#include <iostream>

using namespace std;

int main()
{
    int t;cin >> t;

    while(t--)
    {
        int n,s;cin >> n >> s;
        int divisor = n%2 == 0 ? (n+1) - (n/2) : n - (n/2);
        cout <<  (s / divisor) << endl;
    }
    return 0;
}
