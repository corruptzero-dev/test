package ru.corruptzero;

import java.util.concurrent.Semaphore;

public class Main {
    /*
        Реализовать следующую модель: Есть магазин.
        Открыто несколько касс (всего 10 касс).
        Кассирша может прийти или уйти.
        Также касса может приостановить работу из-за события "Вызов Гали".
        Нужно обслужить 1000 покупателей.
        Один покупатель обслуживается одну ед. времени.
        После каждого покупателя касса может закрыться с вероятностью 10% или прерваться на событие "Вызов Гали".
        Вызов Гали останавливает кассу на 3 ед. времени.
        Каждую единицу времени закрытая касса может открыться с вероятностью 10%.
     */
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        Shop shop = Shop.getInstance();
        for (int i = 0; i < 1000; i++) {
            Customer customer = new Customer(i, semaphore);
            customer.start();
        }
    }
}
