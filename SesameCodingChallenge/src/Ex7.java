import java.util.Scanner;

public class Ex7 {
    public static void minmax(int[] t1, int[] t2) {
        for (int i = 0; i < t1.length; i++) {
            int j;
            int k;
            int maxt1=0;
            int mint2=0;
            for (j = 0; j < t1.length; j++) {
                if(t1[j]>t1[maxt1]) {
                    maxt1 = j;
                }
            }
            for (k = 0; k < t2.length; k++) {
                if(t2[k]<t2[mint2])
                    mint2=k;
            }
            if(t1[maxt1]>t2[mint2]){
                int between=t1[maxt1];
                t1[maxt1]=t2[mint2];
                t2[mint2]=between;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("donner n : ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.println("donner n : ");
            n = sc.nextInt();
        }
        int[] t1= {5,10,80,7};
        int[] t2={2,11,4,2};
        for (int i = 0; i < n; i++) {
            System.out.println("donner T1["+i+"] : ");
            t1[i]=sc.nextInt();
            System.out.println("donner T2["+i+"] : ");
            t2[i]=sc.nextInt();
        }
        minmax(t1,t2);
        for (int i = 0; i < t1.length; i++) {
            System.out.println(t1[i]);
        }
        for (int i = 0; i < t1.length; i++) {
            System.out.println(t2[i]);
        }
    }
}
