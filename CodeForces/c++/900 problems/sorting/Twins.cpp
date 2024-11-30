#include <iostream>
#include <set>

using namespace std;


int main()
{
    int n,sum=0;
    cin >> n;
    multiset<int,greater<int>> coins;
    for (int i=0;i<n;i++)
    {
        int c;
        cin >> c;
        sum+=c;
        coins.insert(c);
    }
    int j=0;
    int min=0;
    for (int coin:coins)
    {
        min+=coin;
        j++;
        if(min>sum/2)
            break;
    }
    cout << j << endl;
    return 0;
}
