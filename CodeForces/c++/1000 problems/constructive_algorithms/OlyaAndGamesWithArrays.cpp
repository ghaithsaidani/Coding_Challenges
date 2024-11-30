#include <algorithm>
#include <iostream>

#include <vector>

using namespace std;

bool sortbysec(const pair<long long,long long> &a,
            const pair<long long,long long> &b)
{
    return (a.second < b.second);
}

int main()
{
    int t;cin >> t;
    while(t--)
    {
        int n;cin >> n;
        long long sum = 0;
        vector<pair<long long,long long>> games(n);
        for(int i=0;i<n;i++)
        {
            int m;cin>> m;
            vector<long long> arr(m);
            for (int j=0;j<m;j++)
            {
                long long a;cin >> a;
                arr[j]=a;
            }
            sort(arr.begin(),arr.end());
            games[i]={arr[1],arr[0]};

        }
        sort(games.begin(),games.end());
        for(int i=1;i<n;i++)
        {
            sum+=games[i].first;
        }

        sort(games.begin(),games.end(),sortbysec);
        cout << (sum + games[0].second) << endl;
    }
    return 0;
}
