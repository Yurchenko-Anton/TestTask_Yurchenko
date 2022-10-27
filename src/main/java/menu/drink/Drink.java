package menu.drink;

import menu.Kitchen;
import menu.MenuItem;

public abstract class Drink extends MenuItem {
    private final String name;
    private final int price;
    private boolean ice;
    private boolean lemon;

    public Drink(String name, int price, boolean ice, boolean lemon) {
        super(name, price, Kitchen.DRINK);
        this.ice = ice;
        this.lemon = lemon;
        this.name = name;
        this.price = price;
    }

    public boolean isIce() {
        return ice;
    }

    public boolean isLemon() {
        return lemon;
    }

    public void setIce(boolean ice) {
        this.ice = ice;
    }

    public void setLemon(boolean lemon) {
        this.lemon = lemon;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ice=" + ice +
                ", lemon=" + lemon +
                '}';
    }
}
