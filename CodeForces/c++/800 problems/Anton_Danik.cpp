#include "iostream"
#include "string"

using namespace std;

int main()
{
    int n;
    cin >> n;
    string str;
    cin >> str;

    int danik = 0;
    int anton = 0;

    for (char& ch : str)
    {
        if (ch == 'D')
        {
            danik++;
            continue;
        }
        anton++;
    }
    if (danik>anton)
        cout << "Danik";
    else if(anton>danik)
        cout << "Anton";
    else
        cout << "Friendship";
    return 0;
}
