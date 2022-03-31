package ru.corruptzero;

import java.util.concurrent.Semaphore;

public class Customer extends Thread {
    int id;
    Semaphore sem;
    Shop shop = Shop.getInstance();

    Customer(int id, Semaphore sem) {
        this.id = id;
        this.sem = sem;
    }

    @Override
    public void run() {
        try {
            for (Cashbox cashbox : shop.cashboxes) {
                if (cashbox.isActive()) {
                    sem.acquire();
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Покупатель №%d обслужен", id);
        sem.release();
    }
}
