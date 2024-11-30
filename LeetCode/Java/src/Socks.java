import java.util.HashMap;

public class Socks {
    public static void main(String[] args) {
        int[] socks = new int[]{1, 2, 2, 1, 1, 3, 5, 1, 4, 4};
        HashMap<Integer, Integer> socks_hash = new HashMap<>();
        for (int sock : socks) {
            if (!socks_hash.containsKey(sock)) {
                socks_hash.put(sock, 0);
            }
        }

        for (int sock :
                socks_hash.keySet()) {
            for (int s :
                    socks) {
                if (s == sock) {
                    socks_hash.replace(sock,socks_hash.get(sock)+1);
                }
            }
            System.out.println(sock + " : " +(socks_hash.get(sock)/2)+" pair of socks ");
        }

    }

}
