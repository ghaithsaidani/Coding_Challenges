public class PlusOne {
    public static int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }
        int i = digits.length - 1;
        while (i > 0) {
            if (digits[i] == 9)
                i--;
            else break;
        }

        int[] result = i == 0 && digits[i] == 9 ? new int[digits.length + 1] : new int[digits.length];

        for (int j = 0; j < result.length; j++) {
            if (j < i)
                result[j] = digits[j];
            else if (j == i)
                result[j] = digits[i] == 9 ? 1 : digits[j] + 1;
            else
                result[j] = 0;
        }
        return result;


    }

    public static void main(String[] args) {
        int[] digits = {5, 9, 9, 9, 9};
        int[] result = plusOne(digits);
        for (int digit :
                result) {
            System.out.println(digit);
        }
    }
}
