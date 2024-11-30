public class Ex4 {
    public static long  inverse(long n){
        String ch=String.valueOf(n);
        String reverse="";
        for (int i = ch.length() - 1; i >=0 ; i--) {
            reverse+=ch.charAt(i);
        }
        return Long.parseLong(reverse);
    }

    public static void main(String[] args) {
        long n=134;
        System.out.println(inverse(n));
    }
}
