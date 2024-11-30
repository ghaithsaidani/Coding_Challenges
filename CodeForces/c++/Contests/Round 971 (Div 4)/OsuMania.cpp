#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int t;cin >> t;
    while(t--)
    {
        int n;cin >> n;
        vector<int> positions(n);
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<4;j++)
            {
                char ch;cin >> ch;
                if(ch=='#')
                {
                    positions[i] = j+1;
                }
            }
        }
        for (int i=n-1;i>=0;i--)
        {
            cout << positions[i] << " ";
        }
        cout << endl;
    }
    return 0;
}
