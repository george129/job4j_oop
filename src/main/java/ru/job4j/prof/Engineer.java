package ru.job4j.prof;

public class Engineer extends Profession {

    public Engineer() {
        super();
    }

    public Engineer(String nm, String sn, String edu, String bd) {
        super(nm, sn, edu, bd);
    }

    public void getOrder(Order ord) {
    }

    public void create() {
    }

    public static void main(String[] args) {
        Engineer eng = new Engineer("Peter", "Fam", "Builder", "1980-10-16");
        System.out.println(eng.getName());
    }
}
