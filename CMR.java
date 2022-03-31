package ru.corruptzero;

public class CMR {
    static CMR INSTANCE = null;

    public static CMR getInstance() {
        if(INSTANCE==null){
            INSTANCE = new CMR();
        }
        return INSTANCE;
    }
    private CMR(){}

    int servedCustomers = 0;

    public int getServedCustomers() {
        return servedCustomers;
    }

    public void setServedCustomers(int servedCustomers) {
        this.servedCustomers = servedCustomers;
    }
}
