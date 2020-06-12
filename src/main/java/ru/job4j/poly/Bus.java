package ru.job4j.poly;

public class Bus implements Transport {
    private int capacity;
    private double tankPrice;

    Bus(int passengers, double fullTankPrice) {
        capacity = passengers;
        tankPrice = fullTankPrice;
    }

    @Override
    public void go() {
        System.out.println("Broom-boom-boom");
    }

    @Override
    public void passengers(int count) {
        int oldcap = capacity;
        capacity -= count <= capacity ? count : capacity;
        System.out.println((oldcap - capacity) + " passengers loaded");
    }

    @Override
    public double fuelUp(double litres) {
        System.out.println("Bus filled up with fuel");
        return tankPrice;
    }
}
