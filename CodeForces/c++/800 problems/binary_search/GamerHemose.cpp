#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int t;cin >> t;
    while(t--)
    {
        int n,h;cin >> n >> h;
        vector<int> damages(n);
        for (int i=0;i<n;i++)
        {
            cin >> damages[i];
        }
        sort(damages.begin(),damages.end(),greater<int>());
        if(damages[0]>=h)
            cout << 1 << endl;
        else if(damages[0]+damages[1] >= h)
        {
            cout << 2 << endl;
        }
        else
        {
            h % (damages[0]+damages[1]) == 0 ? cout << (h/(damages[0]+damages[1])) * 2 << endl:
            h % (damages[0]+damages[1]) <= damages[0] ? cout << (h/(damages[0]+damages[1])) * 2 + 1 << endl
                : cout << (h/(damages[0]+damages[1])) * 2 + 2 << endl;
        }
    }
    return 0;
}
