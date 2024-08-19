#include <iostream>

using namespace std;

int main()
{
    int n,m;cin >> n >> m;
    if(min(n,m) % 2 == 1)
    {
        cout << "Akshat" << endl;
        exit(0);
    }
    cout << "Malvika" << endl;
    return 0;
}