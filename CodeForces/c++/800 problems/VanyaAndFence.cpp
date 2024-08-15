#include "iostream"

using namespace std;

int main()
{
    int n,h;
    cin >> n >> h;
    int bended=0;
    for(int i=0;i<n;i++)
    {
        int x;
        cin >> x;

        if(x > h)
            bended++;
    }

    cout << ((bended * 2) + (n-bended));
    return 0;
}
