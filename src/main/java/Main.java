import menu.MenuItem;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        Scanner scanner = new Scanner(System.in);
        orderService.showMenu();
        List<MenuItem> menuItems = orderService.startOrder(scanner);
        System.out.println("Your order: ");
        menuItems.forEach(System.out::println);
    }
}
