public class Sum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]+array[j]==targetSum)
                    return new int[]{array[i],array[j]};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] array=new int[]{3,5,-4,8,11,1,-1,6};
        int targetSum=10;
        if (twoNumberSum(array, targetSum).length==0) {
            System.out.println("pas de resultat");
        }
        else {
            for (int i = 0; i < twoNumberSum(array, targetSum).length; i++) {
                System.out.println(twoNumberSum(array, targetSum)[i]);
            }
        }
    }
}
