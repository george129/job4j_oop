package ru.job4j.oop;

public class Predator extends  Animal {

    public Predator() {
        super();
        System.out.println("Predator");
    }

    public Predator(String nm) {
        super(nm);
        System.out.println("Predator with name " + super.name);
    }
}
