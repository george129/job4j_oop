package ru.job4j.pojo;

public class Shop {

    public static Product[] delete(Product[] prod, int index) {
        prod[index] = null;
        for (int i = index + 1; i < prod.length; i++) {
                prod[i - 1] = prod[i];
        }
        prod[prod.length - 1] = null;
        return prod;
    }

    public static void print(Product[] prod, boolean withnull) {
        for (int i = 0; i < prod.length; i++) {
            if (prod[i] != null) {
                System.out.println(prod[i].getName());
            } else {
                System.out.println("null");
            }
        }

    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Cheese", 6);
        products[4] = new Product("Potato", 30);
        print(products, true);
        delete(products, 1);
        print(products, true);
        delete(products, 3);
        print(products, true);
    }
}
