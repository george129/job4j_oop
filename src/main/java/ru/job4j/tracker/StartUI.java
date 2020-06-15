package ru.job4j.tracker;

public class StartUI {

    public static void createItem(Input inp, Tracker tr) {
        String addName = inp.askStr("Enter new item name: ");
        tr.add(new Item(addName));
    }

    public static void listItem(Tracker tr) {
        Item[] itarrList = tr.findAll();
        if (itarrList.length != 0) {
            for (int i = 0; i < itarrList.length; i++) {
                System.out.println("[" + itarrList[i].getId() + "]:" + itarrList[i].getName());
            }
        } else {
            System.out.println("Empty");
        }
    }

    public static void editItem(Input inp, Tracker tr) {
        String idEdit = inp.askStr("Enter ID to edit: ");
        String newName = inp.askStr("New item name: ");
        if (tr.replace(idEdit, new Item(newName))) {
            System.out.println("Replace completed.");
        } else {
            System.out.println("Error while tried to edit id=" + idEdit);
        }
    }

    public static void deleteItem(Input inp, Tracker tr) {
        String idDelete = inp.askStr("Enter Id to delete: ");
        if (tr.delete(idDelete)) {
            System.out.println("Item " + idDelete + " deleted.");
        } else {
            System.out.println("Error while tried to delete id=" + idDelete);
        }
    }

    public static void findItemById(Input inp, Tracker tr) {
        String idFind = inp.askStr("Enter id to find: ");
        Item itmFind = tr.findById(idFind);
        if (itmFind != null) {
            System.out.println("found: [" + itmFind.getId() + "]:" + itmFind.getName());
        } else {
            System.out.println("Nothing found with id " + idFind);
        }
    }

    public void findItemByName(Input in, Tracker tr) {
        String findName = in.askStr("Enter name to find: ");
        Item[] itarrFind = tr.findByName(findName);
        if (itarrFind.length != 0) {
            for (int i = 0; i < itarrFind.length; i++) {
                System.out.println("[" + itarrFind[i].getId() + "]:" + itarrFind[i].getName());
            }
        } else {
            System.out.println("Nothing found for \"" + findName + "\"");
        }
    }

    public void init(Input in, Tracker tr) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = in.askInt("");
            switch (select) {
                case 0:
                    createItem(in, tr);
                    break;
                case 1:
                    listItem(tr);
                    break;
                case 2:
                    editItem(in, tr);
                    break;
                case 3:
                    deleteItem(in, tr);
                    break;
                case 4:
                    findItemById(in, tr);
                    break;
                case 5:
                    findItemByName(in, tr);
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
        Input input = new ConsoleInput();
        Tracker tr = new Tracker();
        new StartUI().init(input, tr);
    }
}
