#include <iostream>

using namespace std;

int main()
{
    int n,m;cin >> n >> m;
    int days = n;
    while (n/m>0)
    {
        days+=n/m;
        n=n/m+(n%m);
    }
    cout << days;
    return 0;
}
