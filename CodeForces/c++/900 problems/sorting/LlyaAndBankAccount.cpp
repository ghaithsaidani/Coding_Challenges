#include <iostream>

using namespace std;

int main()
{
    int n;cin >> n;
    if(n<0)
    {
        cout << max((n/10),(n/100) * 10 + ((n%100) % 10));
        exit(0);
    }
    cout << n;

    return 0;
}
