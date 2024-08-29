#include <iostream>
#include <vector>

using namespace std;

int binarySearch(vector<pair<int,int>> limits, int x,int pos,int finalPos)
{
    if(limits.size() == 1)
        return finalPos ;
    if(limits[pos].first <= x && limits[pos].second >= x)
        return finalPos + 1;
    if(limits[pos].first > x)
    {
        limits.erase(limits.begin()+pos,limits.end());
        finalPos -=limits.size() / 2;
    }
    else
    {
        limits.erase(limits.begin(), limits.begin() + pos);
        finalPos += limits.size() / 2;
    }

    return binarySearch(limits,x, limits.size()/2, finalPos);
}

int main()
{
    int n;cin >> n;
    vector<pair<int,int>> limits(n);
    int sum = 0;
    for (int i=0;i<n;i++)
    {
        int x;cin >> x;
        limits[i].first = sum+1;
        sum+=x;
        limits[i].second = sum;
    }
    int m;cin >> m;
    while(m--)
    {
        int x;cin >> x;
        cout << binarySearch(limits,x,limits.size()/2,limits.size()/2) << endl;

    }
    return 0;
}
