#include <iostream>

using namespace std;

int main()
{
    int t;cin >> t;
    while(t--)
    {
        int n,k;cin >> n >> k;

        if(n>k)
        {
            k *= (n%k)==0 ? n/k : (n/k)+1;
        }

        k%n==0 ? cout << k/n : cout << (k/n) + 1;
        cout << endl;
    }
    return 0;
}