package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

public class StartUITest {

    @Test
    public void createItem() {
        String[] answer = {"Just for test", "List", "All", "Items"};
        Input in = new StubInput(answer);
        Tracker tr = new Tracker();
        StartUI.createItem(in, tr);
        StartUI.createItem(in, tr);
        StartUI.createItem(in, tr);
        StartUI.createItem(in, tr);
        Item[] created = tr.findAll();
        Item[] expected = {new Item("Just for test"),new Item("List"), new Item("All"), new Item("Items")};
        Assert.assertEquals(created[0].getName(), expected[0].getName());
        Assert.assertEquals(created[1].getName(), expected[1].getName());
        Assert.assertEquals(created[2].getName(), expected[2].getName());
        Assert.assertEquals(created[3].getName(), expected[3].getName());
    }

    @Test
    public void listItem() {
    }

    @Test
    public void editItem() {
    }

    @Test
    public void deleteItem() {
    }

    @Test
    public void findItemById() {
    }

    @Test
    public void findItemByName() {
    }
}