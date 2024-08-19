#include <complex>
#include <vector>

#include "iostream"

using namespace std;

long divisiblePar(long n, long k)
{
    if (n <= k)
        return 1;
    if(k==1)
        return -1;
    if (n%2==0)
        return 2;
    for (long i = 3; i <= (k < sqrt(n) ? k : sqrt(n)); i+=2)
    {
        if (n % i == 0)
        {
            return n / i;
        }
    }
    return -1;
}

int main()
{
    int t;
    cin >> t;
    vector<long> results;
    for (int i = 0; i < t; i++)
    {
        long n, k;
        cin >> n >> k;
        long result = divisiblePar(n, k);
        if ( result == -1)
            results.push_back(n);
        else
            results.push_back(result);
    }

    for (long val:results)
    {
        cout << val << "\n";
    }
    return 0;
}
