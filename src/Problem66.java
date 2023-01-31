import java.util.ArrayList;
import java.util.Arrays;

public class Problem66 {
    public static int[] plusOne(int[] digits) {
        int i = digits.length - 1;

        while (i >= 0 && digits[i] == 9) {
            i--;
        }

        if (i == -1) {
            int[] results = new int[digits.length + 1];
            results[0] = 1;
            return results;
        }

        int[] result = new int[digits.length];

        result[i] = digits[i] + 1;

        for (int j = 0; j < i; j++) {
            result[j] = digits[j];
        }
        return result;

    }

    public static void main(String[] args) {
        int[] nums = { 9 };
        System.out.println(Arrays.toString(plusOne(nums)));
    }
}
