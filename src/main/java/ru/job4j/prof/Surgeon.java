package ru.job4j.prof;

public class Surgeon extends Doctor {
    private String clinic;

    public Surgeon() {
        super();
    }

    public Surgeon(String nm, String sn, String edu, String bd) {
        super(nm, sn, edu, bd);
    }


    public String operate(Patient p) {
        return "successful";
    }
}
