package ru.job4j.prof;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;
    private int actionCount;


    public Profession() {

    }

    public Profession(String nm, String surn, String educ, String birthd) {
        name = nm;
        surname = surn;
        education = educ;
        birthday = birthd;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public String getBirthday() {
        return birthday;
    }


}
