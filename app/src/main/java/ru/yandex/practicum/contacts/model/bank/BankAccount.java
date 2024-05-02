package ru.yandex.practicum.contacts.model.bank;

public abstract class BankAccount {
    protected int amount;           //количество
    protected String currency;      //валюта

    public void replenishBalance(int amount) {      //пополнение счета
        this.amount += amount;
        System.out.println("Счёт пополнен на " + amount + " " + currency);
    }

    public void withdrawCash(int amount) {  //выдать наличные
    }

    public void showBalance() {         //показать баланс
    }
}
