import java.util.List;

public class Customer {

    private String surname;
    private List<Product> menu;
    Order orders;

    Customer(String surname) {
        this.surname = surname;
        this.orders = new Order();
    }

    public void getMenu(List<Product> m) {
        this.menu = m;
    }

    public void addOrder(Product d) {
        for (int i = 0; i < menu.size(); i++) {
            if (menu.get(i).getName().contentEquals(d.getName())) {
                orders.add(d);
                System.out.println("Sucsess order!");
                return;
            }
        }
        System.out.println("We dont have this product");
    }

    public String getSurname() {
        return this.surname;
    }
}
