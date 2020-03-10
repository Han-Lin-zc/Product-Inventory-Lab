package models;

public class Sneaker {

    private int id;
    private String name;
    private String brand;
    private String sport;
    private int size;
    private int qty;
    private float price;

    public Sneaker(int id, String name, String brand, String sport, int qty, float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.sport = sport;
        this.qty = qty;
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


    public int getQty() {
        return this.qty;
    }

    public float getPrice() {
        return this.price;
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return this.name ; }
}
