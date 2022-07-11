package dev.arydalex.app.models.products;

public class Coffee implements HotDrink {

    private int quantity = 3;
    private int temperature = 3;
    private int sugar = 3;

    public Coffee() {}

    @Override
    public String toString() {
        return "Coffee{" +
                "\"quantity\":" + quantity +
                ", \"temperature\":" + temperature +
                ", \"sugar\":" + sugar +
                "}";
    }
}
