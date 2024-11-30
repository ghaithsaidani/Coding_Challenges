#include <vector>
#include "iostream"

using namespace std;

long calculateSum(const int x) {
    return x%2 == 0 ?
         (x/2) * (x-1) + x
    : ((x/2) + 1) * x;
}

int main() {
    int t;
    cin >> t;
    int numbers[t];
    for (int i=0;i<t;i++) {
        numbers[t] = t+1;
    }

    for (int i=0;i<(sizeof(numbers)/sizeof(numbers[0]));i++) {

    }
}
