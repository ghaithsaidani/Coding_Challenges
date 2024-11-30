#include <iostream>

using namespace std;

int main()
{
    int t;cin >> t;
    while(t--)
    {
        long long n,a,b;cin >> n >> a >> b;
        if(b<=a)
        {
            cout << n*a << endl;
            continue;
        }
        if(b-a>=n)
        {
            long long result = n%2==0 ? (b-(n/2)) * (n-1) + b : (b-(n/2)) * n;
            cout << result << endl;
            continue;
        }
        long long result1 = (b-a)%2 == 0 || (b-a)==1 ? (((b-a)/2)+a)*(b-a-1) + b + (a * (n-(b-a))) : (b-((b-a)/2)) * (b-a) + (a*(n-(b-a)));
        cout << result1 << endl;
    }
}
