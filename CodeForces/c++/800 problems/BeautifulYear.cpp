#include <set>

#include "iostream"
#include "string"
using namespace std;

int main()
{
    int year;
    cin >> year;

    string str = to_string(year);
    bool beautifulYear = false;
    while(!beautifulYear)
    {
        year++;
        str=to_string(year);
        set<char> charSet;
        for (char& ch:str)
        {
            charSet.insert(ch);
        }
        if (charSet.size()==str.length())
        {
            beautifulYear=true;
        }

    }

    cout << year;

    return 0;
}
