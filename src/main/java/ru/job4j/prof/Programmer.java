package ru.job4j.prof;

public class Programmer extends Engineer {


    public Programmer() {
        super();
    }

    public Programmer(String nm, String sn, String educ, String bd) {
        super(nm, sn, educ, bd);
    }

    public Program write() {
        return new Program();
    }

    public void takePart(Project pr) {

    }
}
