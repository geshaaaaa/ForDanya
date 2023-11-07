package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("PRODUCT:");
            System.out.println("1. View all products");
            System.out.println("2. View repaired products");
            System.out.println("3. Add product");
            System.out.println("4. Delete product");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    controller.displayAllProducts();
                    break;
                case 2:
                    controller.displayRepairedProducts();
                    break;
                case 3:
                    System.out.println("Choose product type:");
                    System.out.println("KEYBOARD\tMOUSE\tHEADPHONES");
                    String productType = scanner.next().toUpperCase();
                    switch (productType) {
                        case "KEYBOARD":
                            controller.addKeyboardProduct(scanner);
                            break;
                        case "HEADPHONES":
                            controller.addHeadphonesProduct(scanner);
                            break;
                        case "MOUSE":
                            controller.addMouseProduct(scanner);
                            break;
                        default:
                            System.out.println("Invalid product type.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the id of the product to delete: ");
                    int id = scanner.nextInt();
                    controller.deleteProduct(id);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        }
    }
}