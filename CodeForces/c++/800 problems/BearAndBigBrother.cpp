#include "iostream"

using namespace std;

int main()
{
    int a;
    int b;
    cin >> a;
    cin >> b;
    int i=0;
    while (a<=b)
    {
        a*=3;
        b*=2;
        i++;
    }

    cout << i;
    return 0;
}
