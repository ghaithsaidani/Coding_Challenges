package problems_1300;

import java.util.Scanner;

public class CutRibbon {
    public static int min(int a,int b,int c){
        if(a<b && a<c)
            return a;
        if(b<a && b<c)
            return b;
        return c;
    }
    /*public static int minoftwo(int a,int b,int c){
        if(min(a,b,c)==a){
            return Math.min(b, c);
        }
        else if(min(a,b,c)==b){
            return Math.min(a,c);
        }
        return Math.min(a,b);
    }
    public static int max(int a,int b,int c){
        if(min(a,b,c)==a){
            return Math.max(b, c);
        }
        else if(min(a,b,c)==b){
            return Math.max(a,c);
        }
        return Math.max(a,b);
    }*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();
        int max=0;
        if(a+b+c==n){
            max=3;
        }

        int[] tab;
        if(min(a,b,c)==a){
            tab=new int[]{a, Math.min(b, c), Math.max(b, c)};
        }
        else if(min(a,b,c)==b){
            tab=new int[]{b, Math.min(a, c), Math.max(a, c)};
        }
        else {
            tab= new int[]{c, Math.min(a, b), Math.max(a, b)};
        }
        int sum=0;
        for (int i = 0; i < tab.length; i++) {
            int x=n;
            int result=0;
            if(i>0){
                sum+=tab[i-1];
                do {
                    x-=sum;
                    result+=i;
                }while ((x%tab[i]!=0 || (x/tab[i])>sum) && x>0);
            }
            if(x>=0 && x%tab[i]==0) {
                System.out.println((result + (x / tab[i])));
                break;
            }
            if(n%tab[i]==0) {
                System.out.println(n / tab[i]);
                break;
            }
        }
    }
}
