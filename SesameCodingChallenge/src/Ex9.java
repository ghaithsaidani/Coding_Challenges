public class Ex9 {
    public static String crypter(String ch,int k){
        String result="";
        for (int i = 0; i < ch.length(); i++) {
            if (Character.isLetter(ch.charAt(i))){
                result+=(char) ((int) ch.charAt(i) + 3);
            }
            else result+=ch.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String ch="La programmation est super !";
        System.out.println(crypter(ch,3));
    }
}
