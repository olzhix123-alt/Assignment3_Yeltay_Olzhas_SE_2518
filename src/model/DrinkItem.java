package model;

import exception.InvalidInputException;

public class DrinkItem extends MenuItem {

    public DrinkItem(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String getType() {
        return "Drink";
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.15;
    }

    @Override
    public void validate() throws InvalidInputException {
        if (getPrice() <= 0) {
            throw new InvalidInputException("Drink price must be positive!");
        }
        if (getName() == null || getName().trim().isEmpty()) {
            throw new InvalidInputException("Drink name cannot be empty!");
        }
    }
}