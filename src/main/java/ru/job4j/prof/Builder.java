package ru.job4j.prof;

public class Builder extends Engineer {

    public Builder() {
        super();
    }

    public Builder(String nm, String sn, String educ, String bd) {
        super(nm, sn, educ, bd);
    }

    public String build(Building bld) {
        return "built successfully";
    }
}
