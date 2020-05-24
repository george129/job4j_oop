package ru.job4j.oop;

public class Tiger extends Predator {

    public Tiger() {
        super();
        System.out.println("Tiger");
    }

    public Tiger(String nm) {
        super(nm);
        System.out.println("Tiger with name " + super.name);
    }
}
