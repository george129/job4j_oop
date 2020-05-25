package ru.job4j.prof;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DentistTest {

    @Test
    public void getAll() {
        Builder bld = new Builder("Test", "Tutti", "PSU", "1980-10-20");
        Assert.assertEquals("Test", bld.getName());
        Assert.assertEquals("Tutti", bld.getSurname());
        Assert.assertEquals("PSU",bld.getEducation());
        Assert.assertEquals("1980-10-20", bld.getBirthday());
    }
}