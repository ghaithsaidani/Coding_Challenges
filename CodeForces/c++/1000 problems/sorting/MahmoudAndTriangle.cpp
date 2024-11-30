#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;

int main()
{
    int n;cin >> n;
    vector<int> lengths(n);
    for(int i=0;i<n;i++)
    {
        int l;cin >> l;
        lengths[i]=l;
    }
    sort(lengths.begin(),lengths.end());

    for (int i=0;i<n-2;i++)
    {
        if(lengths[i]+lengths[i+1]>lengths[i+2])
        {
            cout << "YES";
            exit(0);
        }
    }
    cout << "NO";
    return 0;
}