#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int t;cin >> t;
    while(t--)
    {
        int n;cin >> n;
        vector<int> game(n);
        for (int i=0;i<n;i++)
        {
            cin >> game[i];
        }
        sort(game.begin(),game.end(),greater<int>());
        n%2==0 ?
            cout << game[(game.size() / 2) - 1] << endl
            : cout << game[game.size()/2] << endl;
    }
    return 0;
}
