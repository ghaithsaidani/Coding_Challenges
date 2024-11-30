#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int t;cin >> t;
    while(t--)
    {
        int n;cin >> n;
        vector<int> a(n),b(n+1);
        int operations = 0;

        for (int i=0;i<n;i++)
        {
            cin >> a[i];
        }
        for(int i=0;i<n+1;i++)
        {
            cin >> b[i];
            if(i < n) operations+=abs(a[i] - b[i]);
        }
        int minimum = abs(a[0] - b[n]);
        for (int i=1;i<n;i++)
        {
            minimum = min(minimum, abs(a[i] - b[n]));
        }

        cout << operations + 1 + minimum << endl;
    }
    return 0;
}
