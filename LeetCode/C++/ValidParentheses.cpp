
#include "iostream"
#include "string"
#include "stack"
using namespace std;

class Solution {
public:
    static bool isValid(string s) {
        stack<char> characters;
        for (char c : s) {
            if(c=='(' or c=='[' or c=='{'){
                characters.push(c);
            }
            else{
                if(characters.empty() or (c==')' and characters.top()!='(') or (c==']' and characters.top()!='[') or (c=='}' and characters.top()!='{'))
                    return false;
                characters.pop();
            }
        }
        return characters.empty();
    }
};

/*
int main(){
    string s="[({])}";
    cout << Solution::isValid(s);
    return 0;
}*/
