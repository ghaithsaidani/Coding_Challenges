package problems_1300;

import java.util.*;

public class PashmakFlowers {
    public static long somme(long x){
        if(x==0)
            return 0;
        return somme(x-1) + (x-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Long> numbers=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long x= sc.nextInt();
            numbers.add(x);
        }
        long max=numbers.stream().max(Comparator.comparingLong(o -> o)).get();
        long min=numbers.stream().min(Comparator.comparingLong(o->o)).get();
        long maxoccurences=0;
        long minoccurences=0;

        for (int i = 0; i < n; i++) {
            if(numbers.get(i)==max)
                maxoccurences++;
            else if (numbers.get(i)==min)
                minoccurences++;
        }
        if(max==min){
            System.out.println((0) + " " + (somme(maxoccurences)));
        }
        else System.out.println( (max - min) + " " + (maxoccurences * minoccurences));
    }
}
