import java.util.ArrayList;
import java.util.Arrays;

public class Ex6 {
    public static ArrayList<Integer> monotone(ArrayList<Integer> numbers){
        ArrayList<Integer> result=new ArrayList<>();
        for (int i = 0; i < numbers.size()-1; i++) {
            ArrayList<Integer> test=new ArrayList<>();
            test.add(numbers.get(i));
            int j=i+1;
            if(numbers.get(i)<numbers.get(i+1)){
                test.add(numbers.get(i+1));
                for (j = i+1; j < numbers.size()-1; j++) {
                    if(numbers.get(j)<=numbers.get(j+1))
                        test.add(numbers.get(j+1));
                    else break;
                }
            }
            if(numbers.get(i)>numbers.get(i+1)){
                test.add(numbers.get(i+1));
                for (j = i+1; j < numbers.size()-1; j++) {
                    if(numbers.get(j)>=numbers.get(j+1))
                        test.add(numbers.get(j+1));
                    else break;
                }
            }
            i=j-1;
            if(test.size()> result.size()) {
                result.clear();
                result.addAll(test);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(7);
        numbers.add(5);
        numbers.add(3);
        numbers.add(4);
        numbers.add(1);
        numbers.add(6);
        System.out.println("la longueur de liste est : "+monotone(numbers).size());
        for (int x:
             monotone(numbers)) {
            System.out.println(x);
        }

    }
}
