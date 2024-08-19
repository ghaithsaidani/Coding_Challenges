#include <iostream>
#include <set>

using namespace std;

int main()
{

    int s,n;cin >> s >> n;
    multiset<pair<int, int>> dragons;
    while(n--)
    {
        int x,y;cin >> x >> y;
        dragons.insert(pair(x,y));
    }

    for (auto dragon:dragons)
    {
        if(s <= dragon.first)
        {
            cout << "NO";
            exit(0);
        }
        s+=dragon.second;
    }
    cout << "YES";
    return 0;
}
