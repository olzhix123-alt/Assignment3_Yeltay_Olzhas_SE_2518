package model;

import exception.InvalidInputException;

public class FoodItem extends MenuItem {

    public FoodItem(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String getType() {
        return "Food";
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.10;
    }

    @Override
    public void validate() throws InvalidInputException {
        if (getName() == null || getName().trim().isEmpty()) {
            throw new InvalidInputException("Food name cannot be empty!");
        }
        if (getPrice() < 100) {
            throw new InvalidInputException("Food price is too low!");
        }
    }
}