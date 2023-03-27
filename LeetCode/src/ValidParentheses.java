import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class ValidParentheses {

    public static boolean isValid(String s) {
        HashMap<Character, ArrayList<Integer>> reps = new HashMap<>();
        reps.put('(', new ArrayList<>());
        reps.put(')', new ArrayList<>());
        reps.put('{', new ArrayList<>());
        reps.put('}', new ArrayList<>());
        reps.put('[', new ArrayList<>());
        reps.put(']', new ArrayList<>());
        for (int i = 0; i < s.length(); i++) {
            if (reps.containsKey(s.charAt(i))) {
                reps.get(s.charAt(i)).add(i);
            }
        }
        if (reps.get('(').size() == reps.get(')').size() && reps.get('{').size() == reps.get('}').size() && reps.get('[').size() == reps.get(']').size()) {
            for (int i = 0; i < reps.get('(').size(); i++) {
                for (int j = reps.get(')').size() - 1; j >= 0; j--) {
                    if((reps.get(')').get(j)-reps.get('(').get(i))%2==0 || reps.get(')').get(j)<reps.get('(').get(i)) {
                        return false;

                    }
                }
            }
            for (int i = 0; i < reps.get('[').size(); i++) {
                for (int j = reps.get(']').size() - 1; j >= 0; j--) {
                    if((reps.get(']').get(j)-reps.get('[').get(i))%2==0 || reps.get(']').get(j)<reps.get('[').get(i))
                        return false;
                }
            }
            for (int i = 0; i < reps.get('{').size(); i++) {
                for (int j = reps.get('}').size() - 1; j >= 0; j--) {
                    if((reps.get('}').get(j)-reps.get('{').get(i))%2==0 || reps.get('}').get(j)<reps.get('{').get(i))
                        return false;
                }
            }
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String s = "[({])}";
        System.out.println(isValid(s));
    }
}
