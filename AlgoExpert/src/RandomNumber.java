import java.util.*;

public class RandomNumber {
    public static void main(String[] args) {
        Set<Integer> order = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) ((Math.random() * (19 - 1)) + 1);
        //System.out.println(randomNumber);
        do {
            //System.out.println(randomNumber);

            // Wait for the user to press Enter
            //scanner.nextLine();
            if(randomNumber!=13)
                order.add(randomNumber);
            //System.out.println(order.size());
            randomNumber = (int) ((Math.random() * (19 - 1)) + 1);
        } while (order.size() < 17);

        for (int x : order) {
            //System.out.print("Press Enter to display the elements in the set...");
            scanner.nextLine();
            System.out.print(x);
        }
    }
}
