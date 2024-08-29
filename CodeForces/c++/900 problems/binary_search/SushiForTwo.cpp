#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int maximum = 0;
    int firsthalf = 0;
    int secondHalf = 0;
    bool first = true;
    vector<int> sushis(n);
    for (int i = 0; i < n; i++)
    {
        cin >> sushis[i];
        if (firsthalf == 0 && secondHalf == 0)
        {
            firsthalf++;
            //cout << firsthalf;
            continue;
        }

        if (sushis[i - 1] != sushis[i])
        {
            if (firsthalf > 0 && secondHalf == 0)
            {
                first = false;
                secondHalf++;
            }
            else
            {
                //cout << "first half : " << firsthalf << ", second half : " << secondHalf << endl;
                maximum = max(maximum, (min(firsthalf, secondHalf) * 2));
                firsthalf = secondHalf;
                secondHalf = 1;
                //cout << "first half : " << firsthalf << ", second half : " << secondHalf << endl;

                //secondHalf = 0;
            }
        }
        else
        {
            first ? firsthalf+=1 : secondHalf+=1;
            //cout << "first half : " << firsthalf << ", second half : " << secondHalf << endl;

        }
    }
    maximum = max(maximum, (min(firsthalf, secondHalf) * 2));
    cout << maximum << endl;
    return 0;
}
