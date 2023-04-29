package org.example;

import java.util.ArrayList;
import java.util.Scanner;


public class Product {
    private static Store store;
    private static ArrayList<Store> cart;
    private static double total;

    public static void main(String[] args) {
        store = new Store();
        cart = new ArrayList<>();
        total = 0.0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Store Home Screen ===");
            System.out.println("1. Show Products");
            System.out.println("2. Show Cart");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showProducts(scanner);
                    break;
                case 2:
                    showCart(scanner);
                    break;
                case 3:
                    System.out.println("Thank you for shopping with us!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }

    private static void showProducts(Scanner scanner) {
        System.out.println("=== Products ===");
        for (Store product : store.getInventory()) {
            System.out.println(product);
        }

        while (true) {
            System.out.print("Enter the product id to add to cart or X to go back: ");
            String id = scanner.next();

            if (id.equalsIgnoreCase("X")) {
                break;
            }

            Store product = store.getProductById(id);

            if (product == null) {
                System.out.println("Invalid product id! Please try again.");
            } else {
                cart.add(product);
                System.out.println(product.getName() + " added to cart.");
            }
        }
    }

    private static void showCart(Scanner scanner) {
        System.out.println("=== Cart ===");
        for (Store product);



