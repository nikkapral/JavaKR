// Реализовать операционную систему кафе.
//Система должна позволять создать меню/изменять меню/добавлять блюда в стоп лист (блюда которые присутствуют в меню, но отсутствуют сегодня по какой-то причине)/отмечать какие блюда поданы/отображать информацию о заказе по столику/закрывать заказ
//Система оформляет заказ по столам, выбивает итоговую сумму заказа
//Система позволяет вбивать блюда как по кухне, так и по бару
//У каждого проданного товара есть характеристики: цена за штуку товара, единица измерения, количество в единице измерения, состав

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int totalPrice = 0;

        List<Product> products = new ArrayList<>();
        products.add(new Product("Pasta", 10));
        products.add(new Product("Coke", 2));

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Kapralov"));
        customers.add(new Customer("Miron"));

        //метод аналогичен реализации создания заказа
        customers.get(0).getMenu(products);
        customers.get(1).getMenu(products);

        customers.get(0).addOrder(new Product("Pasta", 10));
        customers.get(0).addOrder(new Product("Coke", 2));

        for (Customer n : customers) {
            System.out.println(n.getSurname());
            for (Product m : n.orders.orders.keySet()) {
                int quantity = n.orders.orders.get(m);
                totalPrice += quantity * m.getPrice();
                System.out.printf(m.getName() + "\t" + quantity * m.getPrice() + "\t" + "Number:   " + quantity);
                System.out.println();
            }
            System.out.println("Bill: " + totalPrice);
            totalPrice = 0;
            System.out.println();
        }
    }
}
