#include "iostream"
#include "string"
using namespace std;

int main()
{
    int n;
    cin >> n;
    string str;
    int min = 0;
    for (int i = 0; i < n; i++)
    {
        char ch;
        cin >> ch;
        str += ch;
    }
    for (int i = 1; i < str.length(); i++)
    {
        if (str[i] == str[i - 1])
        {
            min++;
        }
    }
    cout << min;
}
