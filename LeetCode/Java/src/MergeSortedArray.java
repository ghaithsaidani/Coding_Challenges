import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < nums1.length; i++) {
            if (nums2.length > 0)
                nums1[i] = nums2[i - m];
        }
        Arrays.sort(nums1);
        /*for (int i = 0; i < nums1.length - 1; i++) {

            for (int j = i + 1; j < nums1.length; j++) {
                if (nums1[i] > nums1[j]) {
                    int x = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = x;
                }
            }

        }*/

    }

    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {1, 2, 3};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }
}
