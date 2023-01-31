import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class test {

    public static void main(String[] args) {
        customer c1 = new customer("Samitha", "Galle");
        customer c2 = new customer("Samitha", "colombo");
        customer c3 = new customer("Pubudu", "colombo");

        customer[] customerList = { c1, c2, c3 };
        HashMap<String, String> uniquePair = new HashMap<>();

        for (customer customer : customerList) {
            if (!uniquePair.containsKey(customer.name)) {
                if (uniquePair.get(customer.name) != customer.address) {
                    uniquePair.put(customer.name, customer.address);
                }
            }
        }

        System.out.println(uniquePair.size());
    }
}