package ru.corruptzero;

import java.util.ArrayList;

public class Shop{

    private static Shop INSTANCE = null;
    int customersServed = 0;
    ArrayList<Cashbox> cashboxes = new ArrayList<>();
    ArrayList<Cashier> cashiers = new ArrayList<>();
    private Shop() {
        for (int i = 0; i < 10; i++) {
            cashboxes.add(new Cashbox(i));
        }
        for (int i = 0; i < 5; i++) {
            cashiers.add(new Cashier(i));
        }
    }

    public static Shop getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Shop();
        }
        return INSTANCE;
    }
}
