package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner sc, Tracker tr) {
        boolean run = true;
        int select;
        String name;
        String id;
        Item itm;
        while (run) {
            this.showMenu();
            select = sc.nextInt();
            switch (select) {
                case 0:
                    System.out.print("Enter new item name: ");
                    name = sc.nextLine();
                    tr.add(new Item(name));
                    break;
                case 1:
                    tr.findAll(); break;
                case 2:
                    System.out.print("Enter ID to edit: ");
                    id = sc.nextLine();
                    itm = tr.findById(id);
                    if (itm == null) {
                        System.out.println("Not found");
                        break;
                    }
                    System.out.print("New item name: ");
                    name = sc.nextLine();
                    itm.setName(name);
                    if (tr.replace(id, itm)) {
                        System.out.println("Replace completed.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Id to delete: ");
                    id = sc.nextLine();
                    Item del = tr.findById(id);
                    if (tr.delete(id)) {
                        System.out.println("Item " + id + " deleted.");
                    }
                    break;
                case 4:
                    System.out.print("Enter id to find: ");
                    id = sc.nextLine();
                    tr.findById(id);
                    break;
                case 5:
                    System.out.println("Enter name to find: ");
                    name = sc.nextLine();
                    tr.findByName(name);
                    break;
                case 6: run = false; break;
                default: continue;
            }

        }
    }

    private void showMenu() {
        System.out.println("Menu");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.print("Enter choice number: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tracker tr = new Tracker();
        new StartUI().init(sc, tr);

    }
}
