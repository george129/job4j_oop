package ru.job4j.pojo;

public class Product {
    private String name;
    private int count;

    public Product(String nm, int cnt) {
        name = nm;
        count = cnt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
