package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class TrackerTest {

    @Test
    public void generateId() {
        Tracker testracker = new Tracker();
        String s1 = testracker.generateId();
        String s2 = testracker.generateId();
        String s3 = testracker.generateId();
        Assert.assertNotEquals(s1, s2);
        Assert.assertNotEquals(s2, s3);
    }

    @Test
    public void checkNulls() {
        Tracker tr = new Tracker();
        Assert.assertEquals(0, tr.findByName("10").length);
        Assert.assertEquals(0, tr.findAll().length);
        Assert.assertEquals(null, tr.findById("10"));
    }

    @Test
    public void addAndFindAll() {
        Tracker tr = new Tracker();
        tr.add(new Item("test"));
        tr.add(new Item("ddfv"));
        Assert.assertEquals("test", tr.findAll()[0].getName());
        Assert.assertEquals("ddfv", tr.findAll()[1].getName());
        Assert.assertEquals(2, tr.findAll().length);
    }

    @Test
    public void findByName() {
        Tracker tr = new Tracker();
        tr.add(new Item("fgvs"));
        tr.add(new Item("1234"));
        Assert.assertEquals("fgvs", tr.findByName("fgvs")[0].getName());
        Assert.assertEquals("1234", tr.findByName("1234")[0].getName());
    }

    @Test
    public void findById() {
        Tracker tr = new Tracker();
        tr.add(new Item("fgvs"));
        tr.add(new Item("1234"));
        Assert.assertEquals("1234", tr.findById(tr.findByName("1234")[0].getId()).getName());
    }

    @Test
    public void replace() {
        Tracker tr = new Tracker();
        Item it = new Item("Bug");
        tr.add(it);
        String id = it.getId();
        Item itDesc = new Item("Bug with description");
        tr.replace(id, itDesc);
        Assert.assertEquals("Bug with description",tr.findById(id).getName());
    }

    @Test
    public void delete() {
        Tracker tr = new Tracker();
        Item it = new Item("Bug");
        tr.add(it);
        String id = it.getId();
        tr.delete(id);
        Assert.assertNull(tr.findById(id));
    }
}