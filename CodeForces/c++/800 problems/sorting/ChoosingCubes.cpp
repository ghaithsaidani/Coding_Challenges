#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int t;cin >> t;
    while (t--)
    {
        int n,f,k;cin >> n >> f >> k;
        vector<int> cubes(n);
        for(int i=0;i<n;i++)
        {
            int a;cin >> a;
            cubes[i] = a;
        }
        const int favourite = cubes[f - 1];
        sort(cubes.begin(),cubes.end(),greater<int>());
        if(k>=n)
        {
            cout << "YES" << "\n";
            continue;
        }
        favourite == cubes[k-1] && favourite == cubes[k] ? cout << "MAYBE" : favourite < cubes[k-1] ? cout << "NO" : cout << "YES";cout << "\n";
    }
    return 0;
}
