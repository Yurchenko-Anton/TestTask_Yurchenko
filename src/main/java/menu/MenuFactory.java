package menu;

import menu.drink.Coffee;
import menu.drink.Cola;
import menu.drink.Tea;
import menu.lunch.desserts.Medovic;
import menu.lunch.desserts.Napoleon;
import menu.lunch.desserts.Pie;
import menu.lunch.maincourses.italian.Frittata;
import menu.lunch.maincourses.italian.Lasagna;
import menu.lunch.maincourses.italian.Spaghetti;
import menu.lunch.maincourses.mexican.Fajita;
import menu.lunch.maincourses.mexican.Quesadilla;
import menu.lunch.maincourses.mexican.Tacos;
import menu.lunch.maincourses.polish.Beefsteak;
import menu.lunch.maincourses.polish.Goulash;
import menu.lunch.maincourses.polish.Shank;

import java.util.ArrayList;
import java.util.List;

public class MenuFactory {
    private final List<MenuItem> items = new ArrayList<>();

    public List<MenuItem> getItems() {
        fill();
        return items;
    }
// Bad practice
    public void fill(){
        items.add(new Coffee());
        items.add(new Tea());
        items.add(new Cola());
        items.add(new Medovic());
        items.add(new Napoleon());
        items.add(new Pie());
        items.add(new Frittata());
        items.add(new Lasagna());
        items.add(new Spaghetti());
        items.add(new Fajita());
        items.add(new Quesadilla());
        items.add(new Tacos());
        items.add(new Beefsteak());
        items.add(new Goulash());
        items.add(new Shank());
    }
}
