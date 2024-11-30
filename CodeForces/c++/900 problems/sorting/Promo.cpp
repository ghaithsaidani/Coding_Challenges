#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int n,q;cin >> n >> q;
    vector<int> prices(n);
    vector<long long> sums(n);
    for(int i=0;i<n;i++)
    {
        cin >> prices[i];
    }
    sort(prices.begin(),prices.end());
    sums[0] = prices[0];
    for (int i=1;i<n;i++)
    {
        sums[i]= sums[i-1] + prices[i];
    }
    while(q--)
    {
        int x,y;cin >> x >> y;
        int first = n!=x ? (n-1)-x : -1;
        int last = ((n-1)-x) + y;
        first==-1 ? cout << sums[last] << endl : cout << sums[last] - sums[first] << endl;
    }
    return 0;
}
