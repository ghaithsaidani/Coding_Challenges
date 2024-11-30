public class Ex10 {
    public static String occurence(String input){
        String ch="";
        for (int i = 0; i < input.length(); i++) {
            char ch1=input.charAt(i);
            int value=1;
            int j;
            for (j = i+1; j < input.length(); j++) {
                if(ch1==input.charAt(j)) {
                    value++;
                }
                else{
                    break;
                }
            }
            ch+=String.valueOf(value)+ch1;
            i=j-1;

        }
        return ch;
    }

    public static void main(String[] args) {
        String ch="assassin";
        System.out.println(occurence(ch));
    }
}
