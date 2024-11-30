package problems_800;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=0;
        int column=0;
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                int x= sc.nextInt();
                if (x==1){
                    row=j;
                    column=i;
                }
            }
        }

        System.out.println((Math.abs(3-row)+Math.abs(3-column)));
    }
}
