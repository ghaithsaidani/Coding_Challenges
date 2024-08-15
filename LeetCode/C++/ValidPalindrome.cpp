#include "iostream"
#include "string"

using namespace std;

class Solution {
public:
    static bool isPalindrome(string s) {
        string validString="";
        for (char c:s){
            if(isdigit(c) or isalpha(c)){
                validString+=tolower(c);
            }
        }
        cout << validString;
        for (int i = 0; i < validString.length()/2; ++i) {
            if(validString[i]!=validString[validString.length()-1-i])
                return false;
        }
        return true;
    }
};

/*int main(){
    string s = "race a car";
    cout << Solution::isPalindrome(s);
    return 0;
}*/
