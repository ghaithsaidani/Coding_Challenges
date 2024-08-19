#include <iostream>
#include <set>

using namespace std;

int main()
{
    int n,m;
    cin >> n >> m;
    multiset<int> prices;
    for(int i=0;i<n;i++)
    {
        int x;
        cin >> x;
        prices.insert(x);
    }
    int i=0;
    int benefits=0;
    for (int pr:prices)
    {
        if(pr>0)
            break;
        benefits+=abs(pr);
        i++;
        if(i==m)
            break;
    }
    cout << benefits;
    return 0;
}