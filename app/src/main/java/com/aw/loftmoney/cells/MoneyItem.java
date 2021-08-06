package com.aw.loftmoney.cells;

public class MoneyItem {
    private String name;
    private String price;
    private int currentPosition;

    public MoneyItem(String title, String value,int currentPosition) {
        this.name = name;
        this.price = price;
        this.currentPosition = currentPosition;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public int getCurrentPosition() { return currentPosition; }

}
