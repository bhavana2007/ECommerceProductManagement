package com.ecommerce;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {
    private ArrayList<Product> products = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addProduct() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Product Quantity: ");
        int qty = sc.nextInt();

        Product p = new Product(id, name, price, qty);
        products.add(p);
        System.out.println("✅ Product added successfully!");
    }

    public void viewProducts() {
        if (products.isEmpty()) {
            System.out.println("❌ No products available!");
            return;
        }
        System.out.println("\n--- Product List ---");
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void searchProduct() {
        System.out.print("Enter Product ID to search: ");
        int id = sc.nextInt();
        for (Product p : products) {
            if (p.getId() == id) {
                System.out.println("✅ Product Found: " + p);
                return;
            }
        }
        System.out.println("❌ Product not found!");
    }

    public void updateProduct() {
        System.out.print("Enter Product ID to update: ");
        int id = sc.nextInt();
        for (Product p : products) {
            if (p.getId() == id) {
                System.out.print("Enter new Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Enter new Price: ");
                double price = sc.nextDouble();
                System.out.print("Enter new Quantity: ");
                int qty = sc.nextInt();

                p.setName(name);
                p.setPrice(price);
                p.setQuantity(qty);
                System.out.println("✅ Product updated successfully!");
                return;
            }
        }
        System.out.println("❌ Product not found!");
    }

    public void deleteProduct() {
        System.out.print("Enter Product ID to delete: ");
        int id = sc.nextInt();
        for (Product p : products) {
            if (p.getId() == id) {
                products.remove(p);
                System.out.println("✅ Product deleted successfully!");
                return;
            }
        }
        System.out.println("❌ Product not found!");
    }
}
