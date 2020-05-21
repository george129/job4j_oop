package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    void show() {
        System.out.println(this.name + " " + this.food);
    }

    public void eat(String meal) {
        this.food = meal;
    }

    public String sound() {
        String voice = "mew-mew";
        return voice;
    }

    public static void main(String[] args) {
        System.out.println("There is Gav's food:");
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There is Black's food:");
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("fish");
        black.show();

    }
}
