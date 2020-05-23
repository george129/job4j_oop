package ru.job4j.oop;

public class Animal {
    String name;

    public Animal() {
        System.out.println("Animal");
    }

    public Animal(String nm) {
        name = nm;
        System.out.println("Animal with name " + name);
    }
}
