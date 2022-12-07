public class Problem9 {
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
         String revStr="";
         for (int i =0; i<str.length(); i++){
             revStr = str.charAt(i) + revStr;
         }
 
         System.out.println(revStr);
         if (str.equals(revStr)) return true;
         else return false;
     }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    
}
