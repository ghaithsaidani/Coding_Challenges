#include <iostream>

using namespace std;

int main()
{
    string str;
    int counter = 1;
    cin >> str;
    int i = 0;
    while (counter < 7 && i < str.length())
    {
        if (str[i] == str[i - 1])
            counter++;
        else
            counter = 1;
        i++;
    }
    /*for (int i = 1; i < str.length(); i++)
    {
        if (str[i] == str[i - 1])
        {
            counter++;
            if (counter == 7)
            {
                cout << "YES";
                exit(0);
            }
            continue;
        }
        counter = 1;
    }*/
    counter == 7 ? cout << "YES" : cout << "NO";
    return 0;
}
