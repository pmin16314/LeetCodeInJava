public class Problem27 {
    public static int removeElement(int[] nums, int val) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==val){
                continue;
            }

        nums[count]=nums[i];
        count++;
        }
        return count;
    }
    public static void main(String[] args) {

        int[] x = {0,1,2,2,3,0,4,2};
        int val = 3;

        System.out.println(removeElement(x, val));

        
    }
}
