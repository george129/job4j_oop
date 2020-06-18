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
        Assert.assertEquals(created[0].getName(), answer[0]);
        Assert.assertEquals(created[1].getName(), answer[1]);
        Assert.assertEquals(created[2].getName(), answer[2]);
        Assert.assertEquals(created[3].getName(), answer[3]);
    }

    @Test
    public void editItem() {
        Tracker tr = new Tracker();
        Item it = new Item("test");
        tr.add(it);
        String[] answers = {it.getId(), "edited test"};
        StartUI.editItem(new StubInput(answers), tr);
        Assert.assertEquals(answers[1], tr.findById(answers[0]).getName());
    }

    @Test
    public void deleteItem() {
        Tracker tr = new Tracker();
        Item[] items = new Item[3];
        items[0] = new Item("test1");
        items[1] = new Item("test2");
        items[2] = new Item("test3");
        tr.add(items[0]);
        tr.add(items[1]);
        tr.add(items[2]);
        Item[] itemsAfterEdit;
        tr.delete(items[1].getId());
        itemsAfterEdit = tr.findAll();
        Assert.assertEquals(2, itemsAfterEdit.length);
        Assert.assertEquals(itemsAfterEdit[0].getName(), items[0].getName());
        Assert.assertEquals(itemsAfterEdit[1].getName(), items[2].getName());
        Assert.assertEquals(null, tr.findById(items[1].getId()));
    }

    @Test
    public void findItemById() {
    }

    @Test
    public void findItemByName() {
    }
}