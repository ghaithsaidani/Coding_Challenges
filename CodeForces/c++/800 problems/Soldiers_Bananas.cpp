#include "iostream"

using namespace std;

int main()
{
    int k, n, w;

    cin >> k;
    cin >> n;
    cin >> w;
    int sum=0;
    for (int i=1;i<=w;i++)
        sum+=i;
    if(((k * sum) - n) < 0)
        cout << 0;
    else
        cout << ((k * sum) - n);
}
