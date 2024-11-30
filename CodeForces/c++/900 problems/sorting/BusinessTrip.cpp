#include <iostream>
#include <set>

using namespace std;

int main()
{
    int k;
    cin >> k;
    multiset<int,greater<int>> heights;

    for (int i=0;i<12;i++)
    {
        int a;
        cin >> a;
        heights.insert(a);
    }
    if(k==0)
    {
        cout << 0;
        exit(0);
    }
    int min=0;
    int height=0;
    for (const int a:heights)
    {
        height+=a;
        min++;
        if(height>=k)
        {
            cout << min << endl;
            exit(0);
        }
    }
    cout << -1;
    return 0;
}