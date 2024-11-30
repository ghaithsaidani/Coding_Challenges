#include <iostream>
#include <cstdlib>
#include <cmath>
using namespace std;

int main()
{
    int x;
    int row=0;
    int column=0;
    for(int i=0;i<5;i++)
    {
        for(int j=0; j<5;j++)
        {
            cin >> x;
            if(x==1)
            {
                row=i+1;
                column=j+1;
                break;
            }
        }
        if(row!=0 && column!=0)
            break;
    }
    cout << abs(3 - row) + abs(3 - column) << endl;
    return 0;
}
