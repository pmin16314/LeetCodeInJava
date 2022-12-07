import java.util.HashMap;

public class Problem13 {
    public static int romanToInt(String s) {
        HashMap<Character,Integer> x = new HashMap<>();
        x.put('I', 1);
        x.put('V', 5);
        x.put('X', 10);
        x.put('L', 50);
        x.put('C', 100);
        x.put('D', 500);
        x.put('M', 1000);
        
        int result = 0;
        for (int i=0; i<s.length();i++){
            if (i>0 && x.get(s.charAt(i))>x.get(s.charAt(i-1))){
                result =result + x.get(s.charAt(i)) - 2*x.get(s.charAt(i-1));
            }else
            {  
                result = result+x.get(s.charAt(i));
            }
        }
        return result;
        }

    public static void main(String[] args) {
        System.out.println(romanToInt("iii"));
    }
    
}
