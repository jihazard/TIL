package DesignPattern.StrategyPattern_ExampleCode.finalCode;

public class Item {
    private int price;
    private boolean fresh;
    private String name;

    public Item(int price, boolean fresh, String name) {
        this.price = price;
        this.fresh = fresh;
        this.name = name;
    }

    public boolean isFresh() {
        return fresh;
    }

    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
