package ru.job4j.prof;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

public class EngineerTest {

    @Test
    public void getAll() {
        Engineer eng = new Engineer("Tester", "Tutti", "PSU", "1980-10-20");
        Assert.assertEquals("Tester", eng.getName());
        Assert.assertEquals("Tutti", eng.getSurname());
        Assert.assertEquals("PSU", eng.getEducation());
        Assert.assertEquals("1980-10-20", eng.getBirthday());
    }
}