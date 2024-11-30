import java.util.*;

public class PrisonBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int s1 = sc.nextInt(),
                x= sc.nextInt(),
                s2 = sc.nextInt(),
                p = sc.nextInt(),
                f = sc.nextInt();*/

        System.out.println(solution(2, 20 , 3 , 2 , 2 ));
    }

    public static int solution(int s1, int x , int s2 , int p , int f ) {
        float k =  (((float)(x-p)/s1)-((float)x/s2))/f;
        if((int)k==k)
            return (int)k;
        return (int)k + 1;
    }

}
