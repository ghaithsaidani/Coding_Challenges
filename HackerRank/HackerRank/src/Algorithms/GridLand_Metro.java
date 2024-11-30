package Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GridLand_Metro {
    public static int gridlandMetro(int n, int m, int k, List<List<Integer>> track) {
        int available=m*n;
        int[][] tab=new int[n][m];
        for (List<Integer> list:track){
                available-=(list.get(2)- list.get(1) + 1);

        }
        return available;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();

        List<List<Integer>> list=new ArrayList<>();
        for (int i = 0; i < k; i++) {
            List<Integer> nonav=new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                int x=sc.nextInt();
                nonav.add(x);
            }
            list.add(nonav);
        }
        System.out.println(gridlandMetro(n,m,k,list));
        sc.close();
    }
}
