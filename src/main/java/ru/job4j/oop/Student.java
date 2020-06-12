package ru.job4j.oop;

public class Student extends Object {

    public void music(String lyrics) {
        System.out.println("I can sing: " + lyrics);
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student peter = new Student();
        String song = "I believe I can fly";
        for (int i = 0; i < 3; i++) {
            peter.music(song);
        }
        for (int i = 0; i < 3; i++) {
            peter.song();
        }

    }
}
