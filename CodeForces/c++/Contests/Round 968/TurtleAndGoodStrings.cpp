#include <iostream>

using namespace std;

int main()
{
    int t;cin >> t;
    while (t--)
    {
        int n;cin >> n;
        string str;cin >> str;
        if(str[0] == str[str.length()-1])
        {
            cout << "NO" << endl;
            continue;
        }
        cout << "YES" << endl;
    }
    return 0;
}
