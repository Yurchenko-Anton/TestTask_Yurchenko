package order.action;

import menu.Kitchen;
import menu.MenuFactory;
import menu.MenuItem;
import order.OrderValue;

import java.util.Scanner;

public class DoDishesOrder extends OrderValue {

    @Override
    public MenuItem order(Scanner scanner) {
        System.out.println("What kitchen and dish do u want?");
        System.out.println("Example: " + "\nMexican" + "\nTacos");
        String kitchen = scanner.next().toLowerCase();
        String dish = scanner.next().toLowerCase();
        switch (kitchen) {
            case "dessert": {
                return getItem(dish, Kitchen.DESSERT);
            }
            case "italian":
                return getItem(dish, Kitchen.ITALIAN);
            case "mexican":
                return getItem(dish, Kitchen.MEXICAN);
            case "polish":
                return getItem(dish, Kitchen.POLISH);
            default: {
                return null;
            }
        }
    }


}
