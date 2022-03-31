package ru.corruptzero;


public class Cashbox {
    Cashier currentCashier;
    int id;
    Cashbox(int id){
        this.id = id;
    }

    public void setCurrentCashier(Cashier currentCashier) {
        this.currentCashier = currentCashier;
    }

    public boolean isActive() {
        return currentCashier!=null;
    }

    public Cashier getCurrentCashier() {
        return currentCashier;
    }
}
