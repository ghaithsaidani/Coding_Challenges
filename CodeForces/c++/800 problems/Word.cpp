#include <algorithm>

#include "iostream"
#include "string"
#include "cctype"
using namespace std;

int main()
{
    string str;
    int upp=0, low=0;
    cin >> str;

    for (const char& ch : str)
    {
        if (static_cast<int>(ch) >= 65 && static_cast<int>(ch) <= 90)
        {
            upp++;
            continue;
        }
        low++;
    }
    if (low >= upp)
        transform(str.begin(), str.end(), str.begin(), [](unsigned char c) { return tolower(c); });
    else
        transform(str.begin(), str.end(), str.begin(), [](unsigned char c) { return toupper(c); });

    cout << str;
}
