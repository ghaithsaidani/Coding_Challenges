public class AddBinary {
    public static String addBinary(String a, String b) {
        String result = "";
        long rest = 0;
        int min = Math.min(a.length(), b.length());
        int max = Math.max(a.length(), b.length());
        int difference=max-min;
        for (int i = min-1; i >=0; i--) {
            if(max==a.length()){
                if (a.charAt(i+difference) == '0' && b.charAt(i) == '0' && rest == 0) {
                    result = "0" + result;
                    rest = 0;
                } else if ((a.charAt(i+difference) == '1' && b.charAt(i) == '1' && rest == 0) || (a.charAt(i+difference) == '1' && b.charAt(i) == '0' && rest == 1) || (a.charAt(i+difference) == '0' && b.charAt(i) == '1' && rest == 1)) {
                    result = "0" + result;
                    rest = 1;
                } else if ((a.charAt(i+difference) == '1' && b.charAt(i) == '0' && rest == 0) || (a.charAt(i+difference) == '0' && b.charAt(i) == '1' && rest == 0) || (a.charAt(i+difference) == '0' && b.charAt(i) == '0' && rest == 1)) {
                    result = "1" + result;
                    rest = 0;
                } else {
                    result = "1" + result;
                    rest = 1;
                }
            }
            else{
                if (a.charAt(i) == '0' && b.charAt(i+difference) == '0' && rest == 0) {
                    result = "0" + result;
                    rest = 0;
                } else if ((a.charAt(i) == '1' && b.charAt(i+difference) == '1' && rest == 0) || (a.charAt(i) == '1' && b.charAt(i+difference) == '0' && rest == 1) || (a.charAt(i) == '0' && b.charAt(i+difference) == '1' && rest == 1)) {
                    result = "0" + result;
                    rest = 1;
                } else if ((a.charAt(i) == '1' && b.charAt(i+difference) == '0' && rest == 0) || (a.charAt(i) == '0' && b.charAt(i+difference) == '1' && rest == 0) || (a.charAt(i) == '0' && b.charAt(i+difference) == '0' && rest == 1)) {
                    result = "1" + result;
                    rest = 0;
                } else {
                    result = "1" + result;
                    rest = 1;
                }
            }
        }
        for (int i = difference-1; i >= 0; i--) {
            if (max == a.length()) {
                if (a.charAt(i) == '0' && rest == 0) {
                    result = "0" + result;
                    rest = 0;
                } else if ((a.charAt(i) == '1' && rest == 0) || (a.charAt(i) == '0' && rest == 1)) {
                    result = "1" + result;
                    rest = 0;
                } else {
                    result = "0" + result;
                    rest = 1;
                }
            } else {
                if (b.charAt(i) == '0' && rest == 0) {
                    result = "0" + result;
                    rest = 0;
                } else if ((b.charAt(i) == '1' && rest == 0) || (b.charAt(i) == '0' && rest == 1)) {
                    result = "1" + result;
                    rest = 0;
                } else {
                    result = "0" + result;
                    rest = 1;
                }
            }
        }
        if (rest != 0 || result == "") {
            result = rest + result;
        }
        /*long longa = Long.parseLong(a);
        long longb = Long.parseLong(b);
        while (longa != 0 || longb != 0) {
            result = ((longa % 10 + longb % 10 + rest) % 2) + result;
            rest = (longa % 10 + longb % 10 + rest) / 2;
            longa /= 10;
            longb /= 10;
        }
        if (rest != 0 || result == "") {
            result = rest + result;
        }*/
        return result;
    }

    public static void main(String[] args) {
        String a = "1";
        String b = "11";
        System.out.println(addBinary(a, b));
    }
}
