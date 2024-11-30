public class ClimbingStairs {
    public static int climbStairs(int n) {
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        int[] results=new int[n];
        results[0]=1;
        results[1]=2;
        for (int i = 2; i < n; i++) {
            results[i]=results[i-1]+results[i-2];
        }
        return results[n-1];
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }
}
