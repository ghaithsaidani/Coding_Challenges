#include <iostream>
#include <set>


using namespace std;

int main()
{
    int n;
    cin >> n;
    multiset<int> box;
    for (int i=0;i<n;i++)
    {
        int x;
        cin >> x;
        box.insert(x);
    }

    for (const int x:box)
    {
        cout << x << " ";
    }
    return 0;
}