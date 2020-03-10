package models;

public class Sneaker {

    private int id;
    private String name;
    private String brand;
    private String sport;
    private double size;
    private int quantity;
    private float price;

    public Sneaker(int id, String name, String brand, String sport, double size, int quantity, float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.sport = sport;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getSport() {
        return this.sport;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public float getPrice() {
        return this.price;
    }

    public double getSize() {
        return this.size;
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return this.name ; }


}
