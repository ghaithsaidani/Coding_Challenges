#include "iostream"

using namespace std;

int main()
{
    int maximum=0,inTram=0;
    int entered,exited;

    int stops;

    cin >> stops;

    for(int i=0;i<stops;i++)
    {
        cin >> exited >> entered;

        inTram=inTram-exited+entered;

        if(inTram>maximum)
            maximum=inTram;
    }

    cout << maximum;
}
