package problems_1300;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RegistrationSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<String,Integer> occurences=new HashMap<>();
        for (int i = 0; i < n; i++) {
            String nom=sc.next();
            if(occurences.containsKey(nom)){
                occurences.put(nom,occurences.get(nom)+1);
                System.out.println(nom+(occurences.get(nom)));
            }
            else{
                occurences.put(nom,0);
                System.out.println("OK");
            }
        }
    }
}
