#include "iostream"

using namespace std;

long long somme(long long x)
{
    if(x%2==0)
    {
        return x * (x/2) + (x/2);
    }
    return x * (x/2 + 1);

}

int main()
{
    long long m,n;

    cin >> m >> n;

    if(n==1 || n==m)
    {
        long long minmax= somme((m/n) -1);
        cout << minmax << " " << minmax;
    }

    else
    {
        long long min;
        if(m/n == 1)
        {
            min = (m%n);
        }
        else
        {
            if(m%n==0)
            {
                min = somme(m/n -1) * n;
            }
            else
            {
                min = ((m%n) * somme(m/n)) + ((n - (m%n)) * somme(m/n -1));
            }

        }

        long long max = somme(m - n);
        cout << min << " " << max;
    }
    return 0;
}
