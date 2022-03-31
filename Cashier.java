package ru.corruptzero;

import java.util.Random;

public class Cashier extends Thread{
    boolean isActive;
    Cashbox currentCashbox;
    Random random = new Random();
    int id;
    Cashier(int id){
        this.id = id;
        for (Cashbox cashbox : Shop.getInstance().cashboxes){
            if(!cashbox.isActive()){
                cashbox.setCurrentCashier(this);
                currentCashbox = cashbox;
            }
        }
    }
    public void run(){
        try {
            isActive = random.nextBoolean();
            System.out.printf("Кассирша %d %s", id, (isActive?"отдыхает":"работает"));
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
