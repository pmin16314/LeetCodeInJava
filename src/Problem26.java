import java.util.HashMap;

public class Problem26 {
    public static int removeDuplicates(int[] nums) {
        int count=0;
        for (int i=0; i<nums.length;i++){
            if(i<nums.length-1 && nums[i+1]==nums[i]){
                continue;
            }
            nums[count]=nums[i];
            count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] x ={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(x));
    }
    
}
