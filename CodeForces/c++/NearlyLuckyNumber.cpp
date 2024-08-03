#include "iostream"
#include "string"
using namespace std;

int main()
{
    long long n;
    cin >> n;

    string str = to_string(n);
    int total =0;
    for(char& ch:str)
    {
        if(ch=='4' || ch=='7')
        {
            total++;
        }

    }
    if(total==4 || total==7)
    {
        cout << "YES";
        exit(0);
    }
    cout << "NO";
    return 0;
}
