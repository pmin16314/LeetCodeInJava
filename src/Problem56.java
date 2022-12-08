public class Problem56 {
    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");

        return words[words.length-1].length();
    }
    public static void main(String[] args) {
        String x = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(x));
    }
}
