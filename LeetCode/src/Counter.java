public class Counter {
    public static final int x=5;
    public static void main(String[] args) {
        int timer=60;

        while(timer>=0){
            if(timer==0){
                break;
            }
            else {
                System.out.println("the timer is count down ...");
                timer--;
            }
        }
    }
}
