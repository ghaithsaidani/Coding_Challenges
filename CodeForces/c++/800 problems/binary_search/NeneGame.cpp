#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int t;cin >> t;
    while (t--)
    {
        int k,q;cin >> k >> q;
        vector<int> kicked(k);
        for(int i=0;i<k;i++)
        {
            cin >> kicked[i];
        }
        sort(kicked.begin(),kicked.end());
        while (q--)
        {
            int n;cin >> n;
            if(n<kicked[0])
            {
                cout << n << " ";
                continue;
            }
            cout << kicked[0] - 1 << " ";
        }
        cout << endl;
    }
    return 0;
}
