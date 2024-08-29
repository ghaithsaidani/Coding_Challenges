#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int t;cin >> t;
    while(t--)
    {
        int n,q;cin >> n >> q;
        vector<int> arr(n);
        int total=0;
        for (int i=0;i<n;i++)
        {
            int x;cin >> x;
            total+=x;
            arr[i] = total;
        }
        while(q--)
        {
            int l,r,k;cin >> l >> r >> k;
            int actualTotal = l>=2 ?
                total - (arr[r-1] - arr[l-2]) + (k * (r-l+1)):
                total - arr[r-1] + (k * (r-l+1));
            actualTotal%2 == 0 ? cout << "NO" << endl : cout << "YES" << endl;
        }
    }
    return 0;
}
