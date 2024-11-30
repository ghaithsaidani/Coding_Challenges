#include "iostream"
#include "string"
#include "set"
using namespace std;

int main()
{
    multiset<int> mySet;
    string str;
    cin >> str;
    string result;
    int index = 0;
    for(int i=0;i<str.length();i++)
    {
        if(str[i]!='+')
        {
            mySet.insert(str[i] - '0');
        }
    }
    for(auto it = mySet.begin(); it != mySet.end();++it,++index)
    {
        if(index!=0)
        {
            cout << "+" <<*it ;
            continue;
        }
        cout << *it;
    }
    return 0;
}