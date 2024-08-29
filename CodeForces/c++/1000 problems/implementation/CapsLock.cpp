#include <iostream>


using namespace std;

int main()
{
    string s= "cAPSlOCK";

    string str,compare="";cin >> str;
    for(char c:str) compare+=toupper(c);
    if(compare.substr(1,compare.length()-1) == str.substr(1,str.length() - 1))
    {
        isupper(str[0]) ? cout << static_cast<char>(tolower(str[0])) : cout << static_cast<char>(toupper(str[0]));
        for (int i=1;i<str.length();i++)
        {
            cout << static_cast<char>(tolower(str[i]));
        }

        exit(0);
    }
    cout << str;
    return 0;
}
