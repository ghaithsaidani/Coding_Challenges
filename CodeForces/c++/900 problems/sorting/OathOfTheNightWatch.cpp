#include <iostream>
#include <set>

using namespace std;

int main()
{
    int n;cin >> n;
    multiset<int> strengths;
    for (int i=0;i<n;i++)
    {
        int a;cin >> a;
        strengths.insert(a);
    }
    int first = strengths.count(*strengths.begin());
    int last = strengths.count(*strengths.rbegin());
    cout << max(n - (first+last),0);
    return 0;
}
