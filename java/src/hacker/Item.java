package hacker;

public sealed class Item {
    private final String barCode;

    public Item(String barCode) {
        this.barCode = barCode;
    }

    public String getBarCode() {
        return barCode;
    }

    public double computePrice() {
        return 0.0;
    }
}
