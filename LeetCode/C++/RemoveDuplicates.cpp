#include "iostream"
#include "vector"
#include "set"
using namespace std;

class Solution{
public:
    static int removeDuplicates(vector<int>& nums) {
        set<int> nonDuplicates;
        copy(nums.begin(),nums.end(), inserter(nonDuplicates,nonDuplicates.end()));
        return nonDuplicates.size();
    }
};

int main(){
    vector<int> nums={0,0,1,1,1,2,2,3,3,4};
    cout << Solution::removeDuplicates(nums) ;
    return 0;
}