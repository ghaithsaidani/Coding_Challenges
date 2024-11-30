#include <iostream>

using namespace std;

int main()
{
    int t;cin >> t;
    while(t--)
    {
        int n;cin >> n;
        n/4 > 0 ?
            cout << (n/4)+((n%4)/2) << endl :
                cout << (n/2) << endl;
    }
    return 0;
}