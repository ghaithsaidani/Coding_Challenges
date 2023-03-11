public class NonConstructibleChange {
    public static boolean sumexist(int[] coins,int number){

        return false;
    }
    public static int nonConstructibleChange(int[] coins) {
        int min=coins[0];
        for (int i = 1; i < coins.length; i++) {
            if (coins[i]<min)
                min=coins[i];
        }

        return -1;
    }

    public static void main(String[] args) {

    }
}
