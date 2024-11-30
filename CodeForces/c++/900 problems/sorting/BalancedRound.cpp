#include <algorithm>
#include <iostream>
#include <set>
#include <vector>

using namespace std;

int main()
{
    int t;
    cin >> t;

    while (t--)
    {
        int n,k;
        cin >> n >> k;
        int actual=1,serie=1;
        vector<int> difficulties(n);
        for (int j=0;j<n;j++)
        {
            int x;
            cin >> x;
            difficulties[j]=x;

        }
        sort(difficulties.begin(),difficulties.end());
        for (int j=1;j<n;j++)
        {
            if(difficulties[j]-difficulties[j-1]>k)
                actual = 1;
            else
                actual++;
            serie=max(actual,serie);
        }
        cout << n - serie << "\n";
    }
    return 0;
}
