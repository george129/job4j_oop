package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int chrg) {
        this.load = chrg;
    }

    public void exchange(Battery another) {
        this.load += another.load;
        another.load = 0;
    }
}
