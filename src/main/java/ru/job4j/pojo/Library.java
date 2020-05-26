package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book[] book = {
        new Book("Clean Code", 250),
        new Book("Mtziri", 100),
        new Book("Oblomov", 200),
        new Book("Algorithms", 300)};
        for (int i = 0; i < book.length; i++) {
            System.out.println(i + 1 + "." + book[i].getName() + " " + book[i].getPages());
        }
        Book temp;
        temp = book[0];
        book[0] = book[3];
        book[3] = temp;
        for (int i = 0; i < book.length; i++) {
            System.out.println(i + 1 + "." + book[i].getName() + " " + book[i].getPages());
        }
        for (int i = 0; i < book.length; i++) {
            if (book[i].getName().equals("Clean Code")) {
                System.out.println("Found: " + (i + 1) + ":" + book[i].getName() + " " + book[i].getPages());

            }
        }
    }
}
