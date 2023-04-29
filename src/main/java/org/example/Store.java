package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Store {
    private ArrayList<Store> inventory;
    public Store() {
        inventory = new ArrayList<>();
        loadInventory();
    }
    private void loadInventory() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("inventory.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split("\\|");
                String id = fields[0];
                String name = fields[1];
                double price = Double.parseDouble(fields[2]);
                Store product = new Store();
                inventory.add(product);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getProductById(String id) {
    }

    public Store[] getInventory() {
        return new Store[0];
    }

    public boolean getName() {
        return false;
    }
}
