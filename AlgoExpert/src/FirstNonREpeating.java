public class FirstNonREpeating {
    public static int firstNonRepeatingCharacter(String string) {

        for (int i=0;i<string.length();i++){
            int j;
            for (j = 0; j < string.length(); j++) {
                if(string.charAt(i)==string.charAt(j) && j!=i)
                    break;
            }
            if(j==string.length())
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String ch="ababac";
        System.out.println(firstNonRepeatingCharacter(ch));
    }
}
