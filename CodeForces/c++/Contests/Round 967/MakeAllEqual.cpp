#include <algorithm>
#include <iostream>
#include <map>
#include <vector>

using namespace std;

template<typename K, typename V>
std::vector<std::pair<K, V>> sortMapByValue(const std::map<K, V>& map) {

    std::vector<std::pair<K, V>> vec(map.begin(), map.end());

    std::sort(vec.begin(), vec.end(),
        [](const std::pair<K, V>& a, const std::pair<K, V>& b) {
            return a.second > b.second;
        });

    return vec;
}

int main()
{
    int t;cin >> t;

    while (t--)
    {
        int n;cin >> n;
        map<int,int> occurences;
        for(int i=0;i<n;i++)
        {
            int x;cin >> x;
            if(occurences.find(x) != occurences.end())
            {
                occurences.at(x)++;
                continue;
            }
            occurences.insert({x,1});
        }
        vector<pair<int,int>> sorted =sortMapByValue(occurences);
        cout << n - sorted[0].second << endl;
    }
    return 0;
}
