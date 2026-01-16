package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private List<MenuItem> items;

    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public List<MenuItem> getItems() { return items; }
}