package problems_1300;

import java.util.*;

public class ThinkIt {
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Thinkeeteer> thinkeeteers = new ArrayList<>();

        while (true) {
            String thinkeeter = scanner.nextLine();
            String name = thinkeeter.split(" ")[0];
            if (name.equals("exit")) break;
            int timezone = Integer.parseInt(thinkeeter.split(" ")[1]);
            //scanner.nextLine();
            String[] availabiliesStrings = Arrays.copyOfRange(thinkeeter.split(" "), 2, thinkeeter.split(" ").length);
            ArrayList<Availability> availabilities= new ArrayList<>();
            for (String availabiliesString : availabiliesStrings) {
                int start = (Integer.parseInt(availabiliesString.split("-")[0]) - timezone + 24) % 24;
                int end = (Integer.parseInt(availabiliesString.split("-")[1]) - timezone + 24) % 24;
                for (int k = start; k < end; k++) {
                    availabilities.add(new Availability(k, k + 1));

                }
            }
            thinkeeteers.add(new Thinkeeteer(name, timezone, availabilities));
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
