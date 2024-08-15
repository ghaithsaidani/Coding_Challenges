#include "iostream"

using namespace std;

int main()
{
    int n,even=0,odd=0, lastEven=0, lastOdd=0;
    cin >> n;
    for (int i=0;i<n;i++)
    {
        int x;
        cin >> x;
        if(x % 2 ==0)
        {
            even++;
            lastEven=i+1;
        }
        else
        {
            odd++;
            lastOdd=i+1;
        }
    }

    if(even>1)
    {
        cout << lastOdd;
        exit(0);
    }
    cout << lastEven;
    return 0;
}
