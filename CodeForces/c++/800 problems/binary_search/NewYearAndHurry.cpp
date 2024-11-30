#include <cmath>
#include <iostream>

using namespace std;


int main()
{
    int n,k; cin >> n >> k;
    int difference = 240 - k;
    int sum=0;
    for (int i=1;i<=n;i++)
    {
        sum+=(5*i);
        if(sum > difference)
        {
            cout << i-1 << endl;
            exit(0);
        }
    }
    cout << n;
}