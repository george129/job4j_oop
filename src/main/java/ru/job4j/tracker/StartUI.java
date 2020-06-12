package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner sc, Tracker tr) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 0:
                    System.out.print("Enter new item name: ");
                    String addName = sc.nextLine();
                    tr.add(new Item(addName));
                    break;
                case 1:
                    Item[] itarrList = tr.findAll();
                    if (itarrList.length != 0) {
                        for (int i = 0; i < itarrList.length; i++) {
                            System.out.println("[" + itarrList[i].getId() + "]:" + itarrList[i].getName());
                        }
                    } else {
                        System.out.println("Empty");
                    }
                    break;
                case 2:
                    System.out.print("Enter ID to edit: ");
                    String idEdit = sc.nextLine();
                    Item itmEdit = tr.findById(idEdit);
                    if (itmEdit == null) {
                        System.out.println("Not found");
                        break;
                    }
                    System.out.print("New item name: ");
                    String newName = sc.nextLine();
                    itmEdit.setName(newName);
                    if (tr.replace(idEdit, itmEdit)) {
                        System.out.println("Replace completed.");
                    } else {
                        System.out.println("Error while tried to edit id=" + idEdit);
                    }
                    break;
                case 3:
                    System.out.print("Enter Id to delete: ");
                    String idDelete = sc.nextLine();
                    Item del = tr.findById(idDelete);
                    if (tr.delete(del.getId())) {
                        System.out.println("Item " + idDelete + " deleted.");
                    } else {
                        System.out.println("Error while tried to delete id=" + idDelete);
                    }
                    break;
                case 4:
                    System.out.print("Enter id to find: ");
                    String idFind = sc.nextLine();
                    Item itmFind = tr.findById(idFind);
                    if (itmFind != null) {
                        System.out.println("found: [" + itmFind.getId() + "]:" + itmFind.getName());
                    } else {
                        System.out.println("Nothing found with id " + idFind);
                    }
                    break;
                case 5:
                    System.out.print("Enter name to find: ");
                    String findName = sc.nextLine();
                    Item[] itarrFind = tr.findByName(findName);
                    if (itarrFind != null) {
                        for (int i = 0; i < itarrFind.length; i++) {
                            System.out.println("[" + itarrFind[i].getId() + "]:" + itarrFind[i].getName());
                        }
                    } else {
                        System.out.println("Nothing found for \"" + findName + "\"");
                    }
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
