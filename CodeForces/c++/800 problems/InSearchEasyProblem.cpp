#include "iostream"

using namespace std;

int main()
{
    int n;
    cin >> n;

    for (int i=0;i<n;i++)
    {
        int x;
        cin >> x;
        if(x==1)
        {
            cout << "HARD";
            exit(0);
        }
    }
    cout << "EASY";
    return 0;
}
