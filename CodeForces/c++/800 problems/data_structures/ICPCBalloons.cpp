#include <iostream>
#include <set>

using namespace std;

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        string str;
        cin >> str;
        int total = 0;
        set<char> occurences;
        for (char ch : str)
        {
            if (occurences.find(ch) != occurences.end())
            {
                total++;
                continue;
            }

            total += 2;
            occurences.insert(ch);
        }
        cout << total << endl;
    }
    return 0;
}
