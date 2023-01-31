public class Problem6 {
    public static String convert(String s, int numRows) {
        if (s == null || s.isEmpty() || numRows == 0) {
            return "";
        }
        if (numRows == 1) {
            return s;
        }

        StringBuilder result = new StringBuilder();

        int step = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j = j + step) {
                result.append(s.charAt(j));
                if (i != 0 && i != numRows - 1 && (j + step - 2 * i) < s.length()) {
                    result.append(s.charAt(j + step - 2 * i));
                }
            }
        }

        return result.toString();

    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRow = 3;
        System.out.println(convert(s, numRow));
    }
}
