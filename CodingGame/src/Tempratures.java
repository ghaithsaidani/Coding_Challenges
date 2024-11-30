import java.util.ArrayList;
import java.util.Scanner;


public class Tempratures {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        ArrayList<Integer> temperatures = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            temperatures.add(t);
        }
        int result = 0;
        if (temperatures.size() != 0) {
            result=temperatures.get(0);
            for (int i = 1; i < temperatures.size(); i++) {
                if(Math.abs(result)>Math.abs(temperatures.get(i)))
                    result=temperatures.get(i);
                else if(Math.abs(result)==Math.abs(temperatures.get(i)) && result!=temperatures.get(i))
                    result=Math.abs(result);
            }
        }


        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(result);
    }
}
