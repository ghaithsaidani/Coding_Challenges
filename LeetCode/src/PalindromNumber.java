import java.util.Scanner;

public class PalindromNumber {
    public static boolean isPalindrome(int x) {
        String str=String.valueOf(x);

        StringBuilder str2=new StringBuilder();
        str2.append(str);
        return str2.reverse().toString().equals(str);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("x = ");
        int x=sc.nextInt();
        System.out.println(isPalindrome(x));
    }
}
