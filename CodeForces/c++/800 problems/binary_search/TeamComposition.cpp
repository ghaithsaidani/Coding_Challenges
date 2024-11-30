#include <iostream>

using namespace std;

int main()
{
    int t;cin >> t;
    while(t--)
    {
        long long a,b;cin >> a >> b;
        long long minimum = min(a,b);
        long long maximum = max(a,b);
        if(maximum/3 >= minimum)
        {
            cout << minimum << endl;
        }
        else
        {
            int result = (maximum / 3) + ((minimum - (maximum/3)) + (maximum%3)) / 4 ;
            cout << result << endl;
        }
    }
    return 0;
}
