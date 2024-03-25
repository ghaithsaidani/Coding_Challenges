import java.util.Map;
import java.util.Scanner;

public class RomanToInt {
    /*static int romanToInt(String s) {
        int result=0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case 'I':
                    if (i<s.length()-1){
                        if (s.charAt(i+1)=='V'){
                            result+=4;
                            i++;
                        } else if ( s.charAt(i+1)=='X') {
                            result+=9;
                            i++;
                        } else result++;
                    }
                    else result++;
                    break;
                case 'V':
                    result+=5;
                    break;
                case 'X':
                    if (i<s.length()-1){
                        if (s.charAt(i+1)=='L'){
                            result+=40;
                            i++;
                        } else if ( s.charAt(i+1)=='C') {
                            result+=90;
                            i++;
                        } else result+=10;
                    }
                    else result+=10;
                    break;
                case 'L':
                    result+=50;
                    break;
                case 'C':
                    if (i<s.length()-1){
                        if (s.charAt(i+1)=='D'){
                            result+=400;
                            i++;
                        } else if ( s.charAt(i+1)=='M') {
                            result+=900;
                            i++;
                        } else result+=100;
                    }
                    else result+=100;
                    break;
                case 'D':
                    result+=500;
                    break;
                case 'M':
                    result+=1000;
                    break;
            }
        }
        return result;
    }*/
    static int romanToInt(String s){
        Map<Character, Integer> romanMap=Map.of('I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000);

        int result=romanMap.get(s.charAt(s.length()-1));
        for (int i = s.length()-2; i >=0 ; i--) {
            int x=romanMap.get(s.charAt(i));
            int y=romanMap.get(s.charAt(i+1));
            if(x>=y) result+=x;
            else result-=x;
        }
        return result;
    }
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("s = ");
        String s=sc.next();*/
        String s= "MCMXCIV";
        System.out.println(romanToInt(s));
        /*sc.close();*/
    }
}