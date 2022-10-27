import menu.MenuFactory;
import menu.MenuItem;
import order.action.DoDishesOrder;
import order.action.DoDrinkOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderService {
    public List<MenuItem> startOrder(Scanner scanner) {
        List<MenuItem> menuItems = new ArrayList<>();
        System.out.println("Hi, are u ready to order?");
        int number;
        System.out.println("(1-yes/2-no)");
        number = scanner.nextInt();
        do {
            switch (number) {
                case 1: {
                    System.out.println("Ok, u want drink or food ?");
                    System.out.println("1-Drink/2-Food");
                    int choose = scanner.nextInt();
                    MenuItem menuItem = chooseOrderAction(choose, scanner);
                    if (menuItem != null) {
                        menuItems.add(menuItem);
                    } else System.out.println("Wrong order");
                    System.out.println("1-More or 3-Enough");
                    number = scanner.nextInt();
                    break;
                }
                case 2: {
                    System.out.println("Okey, bye ^_^");
                    number = 0;
                    break;
                }
                case 3: {
                    System.out.println("Thx for u order. Wait about 15 minutes");
                    number = 0;
                    break;
                }
                default: {
                    System.out.println("Ooops, bad number, if u want exit press 0");
                    number = scanner.nextInt();
                    break;
                }
            }
        } while (number != 0);
        return menuItems;
    }

    private MenuItem chooseOrderAction(int number, Scanner scanner) {
        switch (number) {
            case 1: {
                return new DoDrinkOrder().order(scanner);
            }
            case 2: {
                return new DoDishesOrder().order(scanner);
            }
            default: {
                System.out.println("Oops, bad number");
                return null;
            }
        }
    }

    public void showMenu() {
        System.out.println("Menu: ");
        new MenuFactory().getItems().forEach(System.out::println);
    }
}
