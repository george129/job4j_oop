package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student ivan = new Student();
        ivan.setFullname("Sidorov Ivan Petrovich");
        ivan.setGroup("aa-203");
        ivan.setEnter(new Date(1567034567890L));

        System.out.println("Student " + ivan.getFullname() + " entered "
                + ivan.getEnter() + " and studies in the group " + ivan.getGroup());
    }
}
