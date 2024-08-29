#include <iostream>
#include <vector>
#include <math.h>
using namespace std;

int main()
{
    int n;
    cin >> n;
    vector<int> game(n);
    long long sum = 0;
    for (int i = 0; i < n - 1; i++)
    {
        int x = 0;
        while (pow(2, x) <= (n - (i + 1)))
            x++;
        int y;
        cin >> y;

        game[i] += y;
        sum+=game[i];
        game[i+pow(2,x-1)]+=game[i];
        game[i]=0;
        cout << sum << endl;
    }
    return 0;
}
