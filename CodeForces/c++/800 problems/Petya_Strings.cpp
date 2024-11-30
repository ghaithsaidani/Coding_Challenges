#include <iostream>
#include <cstdlib>
#include <cmath>
#include "string"
#include "cctype"
using namespace std;

int main()
{
    string ch1;
    string ch2;
    int result = 0;

    cin >> ch1;
    cin >> ch2;

    for (int i = 0; i < ch1.length(); i++)
    {
        if (tolower(ch1[i]) > tolower(ch2[i]))
        {
            result = 1;
            break;
        }
        if (tolower(ch1[i]) < tolower(ch2[i]))
        {
            result = -1;
            break;
        }
    }
    cout << result;
    return 0;
}
