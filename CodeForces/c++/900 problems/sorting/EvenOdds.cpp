#include <iostream>

using namespace std;

int main()
{
    long long n,k;
    cin >> n >> k;

    if(k<=(n/2 + n%2))
    {
        cout << (2*k) - 1;
        exit(0);
    }

    cout << (k - (n/2 + n%2)) * 2;

    return 0;
}