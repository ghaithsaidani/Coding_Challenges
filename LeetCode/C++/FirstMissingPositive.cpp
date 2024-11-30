#include "vector"
#include "iostream"
using namespace std;

class Solution {
public:
    static int firstMissingPositive(vector<int>& nums) {
        for (int i = 0; i < nums.size(); ++i) {
            for (int j = i+1; j < nums.size(); ++j) {
                if(nums[i]>nums[j]){
                    int x=nums[i];
                    nums[i]=nums[j];
                    nums[j]=x;
                }
            }
        }

        if(nums[0]>1 || nums[nums.size()]<=0)
            return 1;
        for (int i = 0; i < nums.size(); ++i) {
            if(nums[i]<0)
                continue;
            else{
                if(nums[i]>1)
                    return 1;
                if(i!=nums.size()-1){
                    if(nums[i+1]-nums[i]>=2)
                        return nums[i]+1;
                }
            }

        }
        return nums[nums.size()-1]+1;

    }
};

/*int main(){
    vector<int> numbers={-1,1000};
    cout << Solution::firstMissingPositive(numbers);
    return 0;
}*/
