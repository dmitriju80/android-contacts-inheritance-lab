package ru.yandex.practicum.contacts.model.bank;

public class DebitAccount extends BankAccount {

    public DebitAccount(int amount, String currency) {
        if (amount < 0) {
            System.out.println("Баланс дебетового счёта не может быть меньше 0");
        } else {
            this.amount = amount;
            this.currency = currency;
        }
    }

    @Override
    public void withdrawCash(int amount) {////выдать наличные
        if (amount > this.amount) {
            System.out.println("У вас недостаточно средств для снятия суммы " + amount + " " + currency);
        } else {
            this.amount -= amount;
            System.out.println("Вы сняли " + amount + " " + currency);
        }
    }

    @Override
    public void showBalance() {   //показать баланс
        System.out.println("На вашем счету осталось " + amount + " " + currency);
    }
}

