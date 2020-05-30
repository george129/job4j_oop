package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private Item[] items = new Item[100];
    private int index;

    public Tracker() {
        index = 0;
    }

    public String generateId() {
        Random rnd = new Random();
        return String.valueOf(rnd.nextLong() + System.currentTimeMillis());
    }

    public Item add(Item item) {
        item.setId(generateId());
        items[index++] = item;
        return items[index - 1];
    }

    public void replace(String id, Item item) {
        int n = indexOf(id);
        if (n >= 0) {
            item.setId(items[n].getId());
            items[n] = item;
        }
    }

    private int indexOf(String id) {
        int ind = -1;
        for (int i = 0; i < index; i++) {
            if (items[i].getId().equals(id)) {
                ind = i;
                break;
            }
        }
        return ind;
    }

    public Item[] findAll() {
        if (index == 0) {
            return null;
        }
        return Arrays.copyOf(items, index);
    }

    public Item[] findByName(String key) {
        if (index == 0) {
            return null;
        }
        Item[] found = new Item[items.length];
        int indx = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getName().matches(key)) {
                found[indx] = items[i];
                indx++;
            }
        }
        if (indx == 0) {
            return null;
        }
        return Arrays.copyOf(found, indx);
    }

    public Item findById(String id) {
        if (index == 0) {
            return null;
        }
        int indx = indexOf(id);
        return indx < 0 ? null : items[indx];
    }
}
