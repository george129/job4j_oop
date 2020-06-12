package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private Item[] items = new Item[100];
    private int index;

    public String generateId() {
        Random rnd = new Random();
        return String.valueOf(rnd.nextLong() + System.currentTimeMillis());
    }

    public Item add(Item item) {
        if (item == null) {
            return null;
        }
        item.setId(generateId());
        items[index++] = item;
        return items[index - 1];
    }

    public boolean replace(String id, Item item) {
        int n = indexOf(id);
        if (n >= 0) {
            item.setId(id);
            items[n] = item;
            return true;
        }
        return false;
    }

    public boolean delete(String id) {
        int n = indexOf(id);
        if (n >= 0) {
            System.arraycopy(items, n + 1, items, n, index - n);
            index--;
            return true;
        }
        return false;
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
        return Arrays.copyOf(items, index);
    }

    public Item[] findByName(String key) {
        Item[] found = new Item[index];
        int indx = 0;
        for (int i = 0; i < index; i++) {
            if (items[i].getName().equals(key)) {
                found[indx] = items[i];
                indx++;
            }
        }
        return Arrays.copyOf(found, indx);
    }

    public Item findById(String id) {
        int indx = indexOf(id);
        return indx < 0 ? null : items[indx];
    }
}
