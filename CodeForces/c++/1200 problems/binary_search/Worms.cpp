#include <iostream>
#include <vector>

using namespace std;

int binarySearch(vector<pair<int,int>> limits,int q)
{
    int middle = limits.size()/2;
    int start = 0;
    int end = limits.size()-1;
    while (start <= end) {
        if (q >= limits[middle].first && q <= limits[middle].second) {
            return middle+1;
        }
        if (q > limits[middle].second) {
            start = middle;
            middle += ((end - start) / 2 + (end - start) % 2);
        }
        else {
            end = middle;
            middle -= ((end - start) / 2 + (end - start) % 2);
        }
    }
    return middle;
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
        //cout << limits[i].first << " " << limits[i].second;
    }
    int m;cin >> m;
    for(int i=0;i<m;i++)
    {
        int q;cin >> q;
        cout << binarySearch(limits,q) << endl;

    }
    return 0;
}
