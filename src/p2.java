public class p2 {
    public static void main(String[] args) {
        int x = 100;
        int y = 300;
        System.out.println("x:" + x + "y:" + y);
        int temp = x;
        x = y;
        y = temp;

        System.out.println("x:" + x + "y:" + y);
    }

}
