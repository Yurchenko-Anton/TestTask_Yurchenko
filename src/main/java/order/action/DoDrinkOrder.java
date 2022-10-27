package order.action;

import menu.Kitchen;
import menu.MenuFactory;
import menu.MenuItem;
import menu.drink.Drink;
import order.OrderValue;

import java.util.Scanner;

public class DoDrinkOrder extends OrderValue {


    @Override
    public MenuItem order(Scanner scanner) {
        System.out.println("Example: Coffee");
        String word = scanner.next().toLowerCase();
        Drink drink = (Drink) getItem(word, Kitchen.DRINK);
        if (drink != null) {
            System.out.println("Maybe u want ice or lemon ?");
            System.out.println("1- Ice, 2- Lemon, Any number - no thx");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    drink.setIce(true);
                    break;
                case 2:
                    drink.setLemon(true);
                    break;
                default:
                    break;
            }
            return drink;
        } else {
            System.out.println("Oops, bad word");
            return null;
        }

    }

}
