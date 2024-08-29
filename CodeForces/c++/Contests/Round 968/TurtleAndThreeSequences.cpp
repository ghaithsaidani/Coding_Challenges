#include <algorithm>
#include <iostream>
#include <map>
#include <set>
#include <vector>

using namespace std;

int main()
{
    int n,a;cin >> n >> a;
    map<int,pair<int, int>> game;
    vector<int> aTable(n);
    for (int i=0;i<3;i++)
    {
        for (int j=0;j<n;j++)
        {
            if (i==0)
            {
                cin >> aTable[j];
            }
            else if(i==1)
            {
                int x;cin >> x;
                game.insert({x,{j,0}});
            }
            else
            {
                int x;cin >> x;
                for (const auto& pair : game) {
                    if (pair.second.first == j) {
                        game.at(pair.first) ={j,x};
                        break;
                    }
                }

                game.insert({x,{j,0}});
            }
        }
    }

    if(game.size()<a)
    {
        cout << -1 << endl;
    }
    else
    {
        std::vector<std::pair<int, std::pair<int, int>>> vec(game.begin(), game.end());

        std::sort(vec.begin(), vec.end(), [](const auto& a, const auto& b) {
            return a.second.second > b.second.second; // Descending order based on second element of the pair
        });
        int sum=0;
        for (int i=0;i<a;i++) {
            sum+=vec[i].second.second;
        }
        cout << sum;
    }
    return 0;
}
