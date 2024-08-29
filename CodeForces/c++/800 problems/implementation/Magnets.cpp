#include <iostream>
#include <vector>

using namespace std;


int main()
{
    long long n;cin >> n;
    vector<int> magnets(n);
    int groups = 1;
    for (int i=0;i<n;i++)
    {
        cin >> magnets[i];
        if(i > 0 && magnets[i] != magnets[i-1])
            groups++;
    }
    cout << groups << endl;
    return 0;
}