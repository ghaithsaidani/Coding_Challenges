//
// Created by ghaith on 11/24/24.
//
#include <iostream>
#include <vector>
using namespace std;

int main(){
	int n; cin >> n;
	int y,z; int x = y = z = 0;
	for (int i=0; i<n;i++) {
		int x1,y1,z1;cin >> x1 >> y1 >> z1;
		x += x1;
		y += y1;
		z += z1;
	}
	x==0 && y==0 && z==0 ? cout << "YES" : cout << "NO";
}
