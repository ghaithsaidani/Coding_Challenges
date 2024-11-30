#include <iostream>

using namespace std;

int main()
{
    int t;cin >> t;
    while(t--)
    {
        string str;cin >> str;
        long long firstIndex = str.find_first_of('1');
        long long op = 0,counter = 0;

        for (long long i=firstIndex;i<str.length();i++)
        {
            if(str[i]=='0')
            {
                op+= (i+1 - firstIndex - counter);
                counter++;
            }
        }
        cout << op << endl;
    }
    return 0;
}
