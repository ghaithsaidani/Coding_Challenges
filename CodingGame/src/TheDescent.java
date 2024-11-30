import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class TheDescent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> heights=new ArrayList<>();
        // game loop
        while (true) {
            heights.clear();
            for (int i = 0; i < 3; i++) {
                int mountainH = in.nextInt();
                heights.add(mountainH);// represents the height of one mountain.
            }
            int index=0;
            for (int i = 0; i < heights.size(); i++) {
                if(heights.get(i)>heights.get(index))
                    index=i;
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println(index);
        }
    }
}
