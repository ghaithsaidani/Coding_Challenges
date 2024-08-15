#include "set"
#include "iostream"

using namespace std;


int main()
{
    int n, a, b, c;
    cin >> n >> a >> b >> c;
    set<int> pieces = {a, b, c};
    int pos = 1;
    int maximum = n / *pieces.begin();
    int rest = n % *pieces.begin();
    auto middlePointer = pieces.begin();
    advance(middlePointer, 1);
    int middle = *middlePointer;

    while (rest != 0)
    {
        if (rest == n)
        {
            pos++;
            switch (pos)
            {
            case 2:
                rest = n % middle;
                maximum= n / middle;
                cout << maximum;
                break;
            case 3:
                maximum = n / *pieces.rbegin();
                rest = 0;
                break;
            }
        }
        switch (pos)
        {
        case 1:
            if (rest % middle == 0)
            {
                maximum += (rest / middle);
                rest = 0;
            }
            else if (rest % *pieces.rbegin() == 0)
            {
                maximum += (rest / *pieces.rbegin());
                rest = 0;
            }
            else
            {
                rest += *pieces.begin();
                maximum--;
            }
            break;
        case 2:
            if (rest % *pieces.rbegin() == 0)
            {
                maximum += (rest / *pieces.rbegin());
                rest = 0;
            }
            else
            {
                rest += middle;
                maximum--;
            }
            break;
        }
    }
    cout << "maximum" << maximum;
    return 0;
}
