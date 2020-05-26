package ru.job4j.pojo;

public class Book {
    private String name;
    private int pages;

    public Book(String nm, int pageCount) {
        name = nm;
        pages = pageCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
