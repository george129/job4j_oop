package ru.job4j.prof;

public class Doctor extends Profession {

    public Doctor() {
        super();
    }

    public Doctor(String nm, String sn, String edu, String bd) {
        super(nm, sn, edu, bd);
    }

    public Disease detectDisease(Patient p) {
        return new Disease();
    }

    public void heal(Patient p) {
    }

}
