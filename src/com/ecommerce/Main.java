package com.ecommerce;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductService service = new ProductService();

        while (true) {
            System.out.println("\n===== E-Commerce Product Management =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: service.addProduct(); break;
                case 2: service.viewProducts(); break;
                case 3: service.searchProduct(); break;
                case 4: service.updateProduct(); break;
                case 5: service.deleteProduct(); break;
                case 6: System.out.println("👋 Thank you! Exiting..."); 
                        sc.close(); 
                        System.exit(0);
                default: System.out.println("❌ Invalid choice!");
            }
        }
    }
}
