#include <iostream>

using namespace std;

int main()
{
    int t;cin >> t;
    while(t--)
    {
        int n;cin >> n;
        char actual;cin >> actual;
        string road;cin >> road;
        int maxSeconds=0;
        if(actual=='g')
        {
            cout << maxSeconds << endl;
            continue;
        }
        for(int i=0;i<n;i++)
        {

            if(road[i]==actual)
            {
                int seconds = 0;
                if(i==n-1) 
                for (int j=i+1;j<n;j++)
                {
                    seconds++;

                    if(road[j]=='g')
                    {
                        break;
                    }
                    if(j==n-1)
                    {
                        j=-1;
                    }
                }
                maxSeconds=max(maxSeconds,seconds);
            }
        }
        cout << maxSeconds << endl;
    }
    return 0;
}
