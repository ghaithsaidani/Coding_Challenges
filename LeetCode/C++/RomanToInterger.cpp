
#include "iostream"
#include "string"
#include "map"
using namespace std;

class Solution {
public:
    static int romanToInt(string s) {
        map<char,int> symbols={{'I',1},{'V',5},{'X',10},{'L',50},{'C',100},{'D',500},{'M',1000}};
        int value=symbols.find(s[s.length()-1])->second;
        for(int i= s.length()-2;i>=0;i--){
            int x=symbols.find(s[i])->second;
            int y=symbols.find(s[i+1])->second;
            x>=y ?
                value+=symbols.find(s[i])->second
                        :value-=symbols.find(s[i])->second;
        }
        return value;
    }
};

/*
int main(){
    string s="LVIII";
    cout << Solution::romanToInt(s);
    return 0;
}*/
