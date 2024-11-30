//
// Created by ghait on 25/03/2024.
//
#include "iostream"
#include "string"
using namespace std;

class Solution {
public:
    static bool isPalindrome(int x) {
        string ch=to_string(x);
        for(int i=0;i<ch.size()/2;i++){
            if(ch[i]!=ch[ch.size()-1-i]){
                return false;
            }
        }
        return true;
    }
};

/*
int main() {
    cout << Solution::isPalindrome(1215);
    return 0;
}*/
