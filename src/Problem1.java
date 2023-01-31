import java.util.Arrays;
import java.util.HashMap;

public class Problem1 {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> values = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer reqValue = (Integer) (target - nums[i]);

            if (values.containsKey(reqValue)) {
                int[] output = { values.get(reqValue), i };
                return output;
            }

            values.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int tar = 9;
        System.out.println(Arrays.toString(twoSum(numbers, tar)));
    }
}