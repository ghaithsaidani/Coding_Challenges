import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ValidateSubsequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int i;
        int index=-1;
        List<Integer> array1 = new ArrayList<>(array);
        for (i = 0; i < sequence.size(); i++) {
            if (!array1.contains(sequence.get(i)))
                break;
            else {
                if(array1.indexOf(sequence.get(i))<=index) {
                    break;
                }
                else {
                    index=array1.indexOf(sequence.get(i))-1;
                    array1.remove(sequence.get(i));
                    for (Integer integer:
                         array1) {
                        System.out.print(integer+" ");
                    }
                    System.out.print("\n");
                }
            }
        }
        return i == sequence.size();
    }

    public static void main(String[] args) {
        List<Integer> array=new ArrayList<>();
        /*array.add(5);
        array.add(1);
        array.add(22);
        array.add(25);
        array.add(6);
        array.add(-1);
        array.add(8);
        array.add(10);*/
        array.add(1);
        array.add(1);
        array.add(6);
        array.add(1);

        List<Integer> sequence=new ArrayList<>();

        //sequence.add(5);
        sequence.add(1);
        sequence.add(1);
        sequence.add(1);
        //sequence.add(22);
        //sequence.add(25);
        sequence.add(6);
        //sequence.add(-1);
        //sequence.add(8);
        //sequence.add(10);

        System.out.println(isValidSubsequence(array,sequence));
    }
}

