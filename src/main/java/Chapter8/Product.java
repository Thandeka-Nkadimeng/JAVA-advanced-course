/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;

/**
 *
 * @author Thandeka Nkadimeng A product description should be at least 5
 * characters Price cannot be zero or negative Quantity to sell can't be more
 * that Quantity in the stock The price increase should be less than R10
 */
public class Product {

    private String code;
    private String description;
    private double price;
    private int quantity;

    public Product(String code, String description, double price, int quantity) {
        this.code = code;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.length() < 5) {
            throw new IllegalArgumentException("Description should be at least 5 characters long" + "\n"
                    + "Current description: [" + description + "]");
        }
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price cannot be 0 or negative");
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //Decrease quantity in the stock
    public void sell(int quantity) throws LowStockException {
        if (quantity > this.quantity) {
            throw new LowStockException("Not enough quantity to sell" + getDescription()
                    + "\nCurrent Quantity in stock: " + getQuantity()
                    + "\nRequested quatity to sell: " + quantity);
        }
        this.quantity -= quantity;
    }

    //Increase the price with percentage
    public void increasePrice(double percentage) throws HighPriceIncreaseException {
        double increase = this.price * (percentage / 100);
        if (increase >= 10) {
            throw new HighPriceIncreaseException("The price increase on" + getDescription()
                    + "is too high [" + increase + "]"
                    + "\nThe increase should be less than 10.00");

        }
        this.price += increase;
    }

    @Override
    public String toString() {
        return "=========Product Details for " + code + "[" + description + "] ============"
                + "\nCode:" + code
                + "\nDescription: " + description
                + "\nPrice: " + price
                + "\nQuantity: " + quantity + '}';
    }

}
