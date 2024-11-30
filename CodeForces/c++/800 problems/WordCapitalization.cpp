#include "iostream"
#include "string"
#include "cctype"
using namespace std;

int main()
{
    string str;
    cin >> str;
    if(static_cast<int>(str[0]) < 65 || static_cast<int>(str[0]) > 90)
    {
        char upperCh = toupper(str[0]);
        cout << upperCh << str.substr(1);
        exit(0);
    }
    cout << str;
    return 0;
}