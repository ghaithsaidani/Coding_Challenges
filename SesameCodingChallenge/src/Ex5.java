import java.util.ArrayList;

public class Ex5 {
    public static ArrayList<Integer> isoles(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int k;
            int j;
            if (!result.contains(nums[i])) {
                for (j = 0; j < nums.length; j++) {
                    if (j != i) {
                        for (k = 0; k < nums.length; k++) {
                            if (k != i && k != j) {
                                if (nums[i] == nums[j] + nums[k])
                                    break;
                            }
                        }
                        if (k< nums.length)
                            break;
                    }
                }

                if (j == nums.length)
                    result.add(nums[i]);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 14, 3, 10, 88, 2};
        for (int x :
                isoles(array)) {
            System.out.println(x);
        }
    }
}
