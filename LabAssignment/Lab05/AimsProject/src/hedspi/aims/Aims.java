package hedspi.aims;

import hedspi.aims.order.Order;

import java.util.Scanner;


public class Aims {
    public static void main(String[] args) {
        int choice = 0;
        showMenu();
        Order order = null;
        do {
            choice = new Scanner(System.in).nextByte();
            switch (choice) {
                case 1: {
                    order = new Order();
                    System.out.println("Created successfully.");
                    break;
                }
                case 2: {

                    break;
                }
                case 3: {
                    break;
                }
            }

        } while (choice > 4 || choice < 0);
    }

    public static void showMenu() {
        System.out.println("Order Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
}
