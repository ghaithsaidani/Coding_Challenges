package problems_1300;

import java.util.*;

public class VirtualCoffee {
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        Thinkeeteer[] thinkeeteers = new Thinkeeteer[n];
        for (int i=0;i<n; i++) {
            String name = scanner.nextLine();
            int timezone = scanner.nextInt();
            scanner.nextLine();
            String[] availabiliesStrings = scanner.nextLine().split(" ");
            ArrayList<Availability> availabilities= new ArrayList<>();
            for (String availabiliesString : availabiliesStrings) {
                int start = (Integer.parseInt(availabiliesString.split("-")[0]) - timezone + 24) % 24;
                int end = (Integer.parseInt(availabiliesString.split("-")[1]) - timezone + 24) % 24;
                for (int k = start; k < end; k++) {
                    availabilities.add(new Availability(k, k + 1));

                }
            }
            thinkeeteers[i] = new Thinkeeteer(name, timezone, availabilities);
        }

        for (int i = 0; i < 24; i++) {
            Availability hour = new Availability(i,i+1);
            boolean av = true;
            for (Thinkeeteer thinkeeteer : thinkeeteers) {
                if (!thinkeeteer.getAvailabilities().contains(hour)) {
                    av = false;
                    break;
                }
            }
            if(av) {
                System.out.print(hour.getStart()+"-"+hour.getEnd()+" ");
            }
        }

    }*/
}
