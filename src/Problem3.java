public class Problem3 {
    public static int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0){
            return 0;
        }
        if (s.length()==1) return 1;

        String res ="";
        int maxLen = 0;

        for (char c:s.toCharArray()){
            String current = String.valueOf(c);

            if (res.contains(current)){
                res = res.substring(res.indexOf(current)+1);
            }
            res=res+current;
            maxLen = Math.max(maxLen, res.length());
        }

        return maxLen;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
