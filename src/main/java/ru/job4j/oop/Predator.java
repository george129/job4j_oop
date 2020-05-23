package ru.job4j.oop;

public class Predator extends  Animal {
    String name;
    public Predator() {
        super();
        System.out.println("Predator");
    }

    public Predator(String nm) {
        super(nm);
    }
}
