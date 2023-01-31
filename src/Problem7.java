public class Problem7 {
    public static int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }

        long reverseNumber = 0;

        while (x > 0) {
            reverseNumber = reverseNumber * 10 + x % 10;
            x = x / 10;
        }

        if (reverseNumber > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) (isNegative ? -reverseNumber : reverseNumber);

    }

    public static void main(String[] args) {
        int num = 1274;
        System.out.println(reverse(num));
        ;
    }
}
