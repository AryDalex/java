package dev.arydalex.app.models.products;

public abstract class HotDrink {

    private final int quantity;
    private final int temperature;
    private final int sugar;

    public HotDrink(int quantity, int temperature, int sugar) {
        this.quantity = quantity;
        this.temperature = temperature;
        this.sugar = sugar;

    }

    public int getQuantity() {
        return quantity;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getSugar() {
        return sugar;
    }

    @Override
    public String toString() {
        return "{" +
                "\"quantity\":" + this.getQuantity() +
                ", \"temperature\":" + this.getTemperature() +
                ", \"sugar\":" + this.getSugar() +
                '}';
    }
}
