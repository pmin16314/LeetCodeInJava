

public class Problem35 {
    public static int searchInsert(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;

        while (start<=end){
            int mid = (start+end)/2;

            if (nums[mid]==target){
                return mid;
            }

            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end+1;
    }


    public static void main(String[] args) {
        int[] x ={1,3,5,6};
        int target = 10;

        System.out.println(searchInsert(x, target));
     }
    
}
