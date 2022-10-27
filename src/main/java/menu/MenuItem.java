package menu;

public abstract class MenuItem {
    private final String name;
    private final int price;
    private final Kitchen kitchen;

    public MenuItem(String name, int price, Kitchen kitchen) {
        this.name = name;
        this.price = price;
        this.kitchen = kitchen;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", kitchen=" + kitchen +
                '}';
    }
}
