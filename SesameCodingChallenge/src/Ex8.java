import java.util.HashMap;

public class Ex8 {
    public static HashMap<String,Integer> biagramms(char[] chars){
        HashMap<String,Integer> result=new HashMap<>();
        for (int i = 0; i < chars.length-1; i++) {
            if(result.containsKey((String.valueOf(chars[i])+chars[i+1])))
                result.put(String.valueOf(chars[i])+chars[i+1],result.get(String.valueOf(chars[i])+chars[i+1])+1);
            else
                result.put(String.valueOf(chars[i])+chars[i+1],1);
        }
        for (int i = chars.length-1; i > 0; i--) {
            if(result.containsKey(String.valueOf(chars[i])+chars[i-1]))
                result.put(String.valueOf(chars[i])+chars[i-1],result.get(String.valueOf(chars[i])+chars[i-1])+1);
            else
                result.put(String.valueOf(chars[i])+chars[i-1],1);
        }
        return result;
    }

    public static void main(String[] args) {
        char[] chars={'S','E','S','A','M','E'};

        HashMap<String,Integer> result=biagramms(chars);
        for (String ch:
             result.keySet()) {

            System.out.println(ch+" figure "+result.get(ch));
        }
    }
}
