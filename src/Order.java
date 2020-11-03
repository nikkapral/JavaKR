import java.util.HashMap;
import java.util.Map;

public class Order {
    Map<Product, Integer> orders;

    Order() {
        orders = new HashMap<>();
    }
    public void add(Product d) {
        int count = 1;
        for (Product a : orders.keySet()) {
            if (a.getName().contentEquals(d.getName())) {
                int oldQuantity = orders.get(a);
                orders.put(a, ++oldQuantity);
                return;
            }
        }
        orders.put(d, count);
    }
}
