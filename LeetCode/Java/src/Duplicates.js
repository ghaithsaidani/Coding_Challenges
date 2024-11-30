/**
 * @param {number[]} nums
 * @return {number}
 */
const removeDuplicates = function(nums) {
    let unique = [];
    let duplicates=0
    nums.forEach(element => {
        if (!unique.includes(element)) {
            unique.push(element);
        }
        else{
            duplicates++
        }

    });
    for (let i = 0; i < duplicates; i++) {
        unique.push("_")
    }
};