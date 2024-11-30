#include <iostream>
#include <map>

using namespace std;

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n, m;
        cin >> n >> m;
        map<char, int> occurrences;
        string str;
        cin >> str;
        int result = 0;
        for (char& ch : str)
        {
            if (occurrences.find(ch) != occurrences.end())
            {
                occurrences.at(ch)++;
                if (occurrences.at(ch) <= m)
                    result--;
                continue;
            }
            occurrences.insert({ch, 1});
            result += (m - 1);
        }
        cout << result + (7 - occurrences.size()) * m << endl;
    }
    return 0;
}
