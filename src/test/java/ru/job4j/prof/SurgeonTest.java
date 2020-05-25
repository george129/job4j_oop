package ru.job4j.prof;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class SurgeonTest {

    @Test
    public void getAll() {
        Surgeon surg = new Surgeon("Test", "Tutti", "PSU", "1980-10-20");
        Assert.assertEquals("Test", surg.getName());
        Assert.assertEquals("Tutti", surg.getSurname());
        Assert.assertEquals("PSU", surg.getEducation());
        Assert.assertEquals("1980-10-20", surg.getBirthday());
    }
}