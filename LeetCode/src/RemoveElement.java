import java.util.ArrayList;

public class RemoveElement {
    public static int removeElement(int[] nums,int val){
        int placement=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val) {
                if (i!=placement) {
                    int k = nums[i];
                    nums[i] = nums[placement];
                    nums[placement] = k;
                }
                placement++;
            }

        }

        return placement;
    }
    public static void main(String[] args) {
        int[] hey={0,1,2,2,3,0,4,2};
        System.out.println(removeElement(hey,2));
        for (int x:
             hey) {
            System.out.println(x);
        }
    }
}
