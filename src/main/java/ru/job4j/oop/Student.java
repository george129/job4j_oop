package ru.job4j.oop;

public class Student {

    public void music() {
        System.out.println("Tra-ta-ta");
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student peter = new Student();
        for (int i = 0; i < 3; i++) {
            peter.music();
        }
        for (int i = 0; i < 3; i++) {
            peter.song();
        }

    }
}
