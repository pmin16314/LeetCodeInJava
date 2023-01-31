public class Employee extends Person {

    public Employee() {
        System.out.println("Employee called");
    }

    public void sum(double x, double y) {
        System.out.println("aa" + x + y);
    }

    public static void main(String[] args) {
        Employee em1 = new Employee();

        em1.sum(2.3, 3.3);
    }

}
