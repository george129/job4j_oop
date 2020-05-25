package ru.job4j.inheritance;

public class JSONReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        String br = System.lineSeparator();
        return "{" + br + "name:" + name + "," + br
        + "body:" + body + br + "}.";
    }
}
