#include <algorithm>
#include <cmath>
#include <iostream>
#include <valarray>
#include <vector>

using namespace std;

int main()
{
    int t;cin >> t;
    while(t--)
    {
        int n, c, d;cin >> n >> c >> d;
        vector<int> matrix(pow(n,2));
        long long sum = 0;
        for(int i=0;i<pow(n,2);i++)
        {
            cin >> matrix[i];
            sum+=matrix[i];
        }
        sort(matrix.begin(),matrix.end());
        int pos = (matrix.size() / 2) + (matrix.size() % 2) - 1;

        /*while(pos!=matrix.size()-1)
        {
            cout << pos;
            if(find(matrix.begin(),matrix.end(),matrix[pos]+min(c,d))==matrix.end())
            {
                break;
            }
            if(find(matrix.begin(),matrix.end(),matrix[pos]+max(c,d))==matrix.end())
            {
                break;
            }
            pos++;
        }*/
        matrix[pos] == (sum / matrix.size())+((sum/n)%n) ? cout << "YES" << endl : cout << "NO" << endl;
    }
    return 0;
}
