package ru.job4j.oop;

public class Tiger extends Predator {
    String name;

    public Tiger() {
        super();
        System.out.println("Tiger");
    }

    public Tiger(String nm) {
        name = nm;
        System.out.println("Tiger with name " + name);
    }
}
