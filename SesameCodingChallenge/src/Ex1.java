import java.util.Scanner;

public class Ex1 {
    public static String carreparfait(int n){
        String ch="";
        int i=1;
        int j=1;
        for (i = 1; i < Math.abs(Math.sqrt(n)); i++) {
            for (j = 1; j < Math.abs(Math.sqrt(n)); j++) {
                if (Math.abs(n)==Math.pow(i,2)+Math.pow(j,2))
                    break;
            }
            if(j<Math.abs(Math.sqrt(n))-1)
                break;
        }

        if(!(i==Math.abs(Math.sqrt(n)) && j==Math.abs(Math.sqrt(n)))){
            ch=(i)+"²"+" + "+j+"²";
        }
        return ch;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("donner une entier > 5 : ");
        int n=sc.nextInt();
        if(carreparfait(n)!=""){
            System.out.println(n+" = "+carreparfait(n));
        }
        else System.out.println(n+"n'est pas carré parfait");
    }
}
