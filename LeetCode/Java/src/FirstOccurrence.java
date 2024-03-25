public class FirstOccurrence {
    public static int strStr(String haystack, String needle) {

            return haystack.indexOf(needle)+1;

    }
    public static void main(String[] args) {
        System.out.println(strStr("leetcode","t"));
    }
}
