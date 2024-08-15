import java.util.*;
public class EndPoint {
    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(solution(str));
    }
    public static String solution(String str) {
        int x=0;
        int y=0;
        char direction='t';
        HashMap<Integer,Character> directions=new HashMap<>();
        directions.put(0,'t');
        directions.put(1,'r');
        directions.put(2,'b');
        directions.put(3,'l');
        for(int i=0;i<str.length();i++) {
            switch(str.charAt(i)) {
                case 'f':
                    switch (direction) {
                        case 'r':
                            x+=1;
                            break;
                        case 'l':
                            x-=1;
                            break;
                        case 't':
                            y+=1;
                            break;
                        case 'b':
                            y-=1;
                            break;
                    }
                    break;
                case 'r':
                    switch (direction) {
                        case 't':
                            direction='r';
                            break;
                        case 'r':
                            direction='b';
                            break;
                        case 'b':
                            direction='r';
                            break;
                        case 'l':
                            direction='t';
                            break;
                    }
            }
        }
    }*/
}