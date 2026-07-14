package OperationsOnString;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        int choice;

        do {
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("Enter your choice :");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Enter the item to be inserted:");
                    String item = sc.nextLine();
                    list.add(item);
                    System.out.println("Inserted successfully");
                    break;

                case 2:
                    System.out.println("Enter the item to search :");
                    item = sc.nextLine();

                    if (list.contains(item))
                        System.out.println("Item found in the list.");
                    else
                        System.out.println("Item not found in the list.");
                    break;

                case 3:
                    System.out.println("Enter the item to delete :");
                    item = sc.nextLine();

                    if (list.contains(item)) {
                        list.remove(item);
                        System.out.println("Deleted successfully");
                    } else {
                        System.out.println("Item does not exist.");
                    }
                    break;

                case 4:
                    System.out.println("The Items in the list are :");
                    for (String s : list) {
                        System.out.println(s);
                    }
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        sc.close();
    }
}