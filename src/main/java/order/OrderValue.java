package order;

import menu.Kitchen;
import menu.MenuFactory;
import menu.MenuItem;

public abstract class OrderValue implements Order {

    public MenuItem getItem(String word, Kitchen kitchen) {
        return new MenuFactory().getItems().stream()
                .filter(menuItem -> menuItem.getKitchen().equals(kitchen))
                .filter(menuItem -> menuItem.getName().toLowerCase().equals(word)).findFirst().orElse(null);
    }
}
