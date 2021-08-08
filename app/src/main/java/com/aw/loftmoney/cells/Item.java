package com.aw.loftmoney.cells;

public class Item {
    private String name;
    private String price;
    private int currentPosition;

    public Item(String name, String price, int currentPosition) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getCurrentPosition() { return currentPosition; }
}
