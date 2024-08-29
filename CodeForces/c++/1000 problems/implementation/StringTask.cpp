#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main()
{
    string str,result="";cin >> str;
    vector<char> vowels={'a','o','y','e','u','i'};
    for (const char ch:str)
    {
        if(find(vowels.begin(),vowels.end(),tolower(ch)) != vowels.end())
        {
            continue;
        }

        result += '.';
        result+=tolower(ch);
    }

    cout << result << endl;
    return 0;
}
