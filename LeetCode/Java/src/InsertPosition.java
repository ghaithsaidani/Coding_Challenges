public class InsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int i=0;
        while (i<nums.length){
            if(target<=nums[i])
                break;
            i++;
        }
        return i;
    }
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=5;
        System.out.println(searchInsert(nums,target));
    }
}
