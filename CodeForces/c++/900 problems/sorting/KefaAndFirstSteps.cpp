#include <iostream>

using namespace std;

int main()
{
    int n;
    cin >> n;

    int max = 1;
    int actualMax = 1;
    int latest = 0;
    for(int i=0;i<n;i++)
    {
        int x;
        cin >> x;
        if(i>0)
        {
            if(x >= latest)
            {
                actualMax++;
                if(actualMax>max)
                    max = actualMax;
            }
            else
            {
                actualMax = 1;
            }
        }
        latest = x;
    }
    cout << max;
    return 0;
}
