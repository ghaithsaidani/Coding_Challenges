public class Palindrome {
    public static boolean isPalindrome(String str) {
        /*String reverse= "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=String.valueOf(str.charAt(i));
        }*/
        StringBuilder reverse= new StringBuilder();
        reverse.append(str);
        reverse.reverse();
        return str.equals(String.valueOf(reverse));
    }

    public static void main(String[] args) {
        String ch="abcdcba";
        System.out.println(isPalindrome(ch));
    }
}
