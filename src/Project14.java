public class Project14 {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();

       if (strs ==null || strs.length==0){
        return result.toString();
       }

       if (strs.length ==1){
        return strs[0];
       }

       int minLen =strs[0].length();

    for (String i:strs){
        if(i.length()<minLen) minLen = i.length();
    }

    for (int i=0; i<minLen;i++){
        char current = strs[0].charAt(i);

        for (String str : strs) {
                if (str.charAt(i) != current) {
                    return result.toString();
                }
            }
        
        result.append(strs[0].charAt(i));
    }
    System.out.println(minLen);



       return result.toString();
       
    }
    public static void main(String[] args) {
        String [] x ={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(x));
    }
}
