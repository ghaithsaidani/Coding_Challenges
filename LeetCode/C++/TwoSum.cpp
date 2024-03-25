#include <iostream>
#include <vector>
#include <map>
using namespace std;
class TwoSum {
public : static vector<int> twoSum(vector<int>& nums, int target) {
        map<int,int> numToIndex;
        for (int i = 0; i < nums.size(); i++) {
            int x=target-nums[i];
            if(numToIndex.count(x)){
                return vector<int>{ numToIndex.find(x)->second,i };
            }
            numToIndex.insert(pair<int,int>(nums[i],i));
        }
        return vector<int>{};
    }
};

/*int main() {
    vector<int> nums = {2, 7, 11, 15};
    int target = 9;
    vector<int> result = TwoSum::twoSum(nums, target);
    for (int i : result) {
        cout << i;
    }
    return 0;
}*/
