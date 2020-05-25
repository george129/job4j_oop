package ru.job4j.prof;

public class Surgeon extends Doctor {
    private String clinic;

    public String operate(Patient p) {
        return "successful";
    }
}
