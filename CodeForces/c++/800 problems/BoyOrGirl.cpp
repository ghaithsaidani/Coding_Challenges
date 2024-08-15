#include "iostream"
#include "string"
#include "set"
using namespace std;

int main()
{
    string str;
    cin >> str;
    set<char> mySet;

    for (char& ch : str)
    {
        mySet.insert(ch);
    }
    if(mySet.size() % 2 == 0)
    {
        cout << "CHAT WITH HER!";
    }
    else
    {
        cout << "IGNORE HIM!";
    }
    return 0;
}
