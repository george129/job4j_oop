package ru.job4j.inheritance;

public class HtmlReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        return "<body> <br/>" + "<h1>" + name + "/<h1>"
                + "<br/>"
                + "<span>" + body + "</span>"
                + "</body>";
    }
}
