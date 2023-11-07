package org.example;

import org.example.entities.HeadphonesProduct;
import org.example.entities.KeyboardProduct;
import org.example.entities.MouseProduct;
import org.example.entities.Product;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    List<Product> products = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int id = 1;
    double price;
    String title;
    String status;
    public void displayAllProducts()
    {
        for (Product product : products)
        {
            System.out.println("Id = " + product.getId() +
                    ", Назва = " + product.getTitle() +
                    ", Ціна за ремонт = " + product.getPrice() +
                    ", Статус товару = " + product.getStatus());
        }

    }
    public void displayRepairedProducts()
    {
        for (Product product : products) {
            if (product.getStatus().equals("Відремонтовано")) {
                System.out.println(" Id = " + product.getId() +
                        ", Назва = " + product.getTitle() +
                        ", Ціна за ремонт = " + product.getPrice());
            }
        }
    }
    public void addKeyboardProduct(Scanner scanner) {
        KeyboardProduct keyboardProduct = new KeyboardProduct(id, title,status, price);
        System.out.print("Title: ");
        title = scanner.next();
        System.out.print("Price: ");
        price = scanner.nextDouble();
        System.out.print("Status: ");
        status = scanner.next();
        products.add(keyboardProduct);
        id++;
    }

    public void addMouseProduct(Scanner scanner) {
        MouseProduct mouseProduct = new MouseProduct(id, title,status, price);
        System.out.print("Title: ");
        title = scanner.next();
        System.out.print("Price: ");
        price = scanner.nextDouble();
        System.out.print("Status: ");
        status = scanner.next();
        products.add(mouseProduct);
        id++;
    }

    public void addHeadphonesProduct(Scanner scanner) {
        HeadphonesProduct headphonesProduct = new HeadphonesProduct(id, title,status, price);
        System.out.print("Title: ");
        title = scanner.next();
        System.out.print("Price: ");
        price = scanner.nextDouble();
        System.out.print("Status: ");
        status = scanner.next();
        products.add(headphonesProduct);
        id++;
    }


    public void deleteProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                break;
            }
        }
    }


     }


