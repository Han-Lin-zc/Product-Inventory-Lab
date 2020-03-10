package services;

import models.Sneaker;

import java.util.ArrayList;
import java.util.List;

public class SneakerService {

    private static int nextId = 1;
    private List<Sneaker> inventory = new ArrayList<>();



    public Sneaker create(String name, String brand, String sport, double size, int quantity, float price) {
        Sneaker createSneaker = new Sneaker(nextId++, name, brand, sport, size, quantity, price);
        inventory.add(createSneaker);
        return createSneaker;
    }

    public Sneaker findSneaker(int id) { return inventory.get(id); }

    public Sneaker[] findAll() {
        Sneaker[] arr = inventory.toArray(new Sneaker[inventory.size()]);
        return arr; }
}
