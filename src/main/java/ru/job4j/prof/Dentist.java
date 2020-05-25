package ru.job4j.prof;

public class Dentist extends Doctor {

    public Dentist() {
        super();
    }

    public Dentist(String nm, String sn, String educ, String bd) {
        super(nm, sn, educ, bd);
    }

    public String repair(Patient p) {
        return "repaired";
    }
}
