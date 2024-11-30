import java.util.*;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int result=0;
        ArrayList<Integer> numsList= new ArrayList<>();
        for (int n:
             nums) {
            numsList.add(n);
        }
        for (int i = 0; i < numsList.size(); i++) {
            for (int j = i+1; j < numsList.size(); j++) {
                if (Objects.equals(numsList.get(i), numsList.get(j))){
                    numsList.remove(j);
                    j++;
                    result++;
                }
            }
        }
        nums=numsList.stream().mapToInt(i -> i).toArray();
        return result;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3};
        int x=removeDuplicates(nums);
    }
}
