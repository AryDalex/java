package dev.arydalex.app.models.products;

public class Tea implements HotDrink {

    private int quantity = 3;
    private int temperature = 3;
    private int sugar = 3;

    public Tea() {}

    @Override
    public String toString() {
        return "Tea{" +
                "\"quantity\":" + quantity +
                ", \"temperature\":" + temperature +
                ", \"sugar\":" + sugar +
                "}";
    }
}
