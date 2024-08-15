#include "iostream"
#include "string"
#include "vector"
#include "bits/stdc++.h"
using namespace std;

class Solution {
public:
    static string longestCommonPrefix(vector<string>& strs) {
        sort(strs.begin(),strs.end());
        string first= strs[0];
        string last=strs[strs.size()-1];
        int index=0;
        while(index < first.length() and index < last.length()){
            if(first[index]==last[index]) index++;
            else break;
        }
        return first.substr(0,index);
    }
};

/*int main(){
    vector<string> strs={""};
    cout << Solution::longestCommonPrefix(strs);
    return 0;
}*/
