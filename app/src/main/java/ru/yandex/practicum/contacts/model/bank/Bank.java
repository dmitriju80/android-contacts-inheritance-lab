package ru.yandex.practicum.contacts.model.bank;

public class Bank {
    public void createNewAccount(String typeBankAccount,String currency){

if (typeBankAccount.equals("debit_account")){
    new DebitAccount(0, currency);
    System.out.println("Ваш дебетовый счёт создан");
}
       else if (typeBankAccount.equals("credit_account")) {
            int limit;
            if (currency.equals("RUB")){limit=100000;}
            else if (currency.equals("USD")){limit=1250;}
            else if (currency.equals("EUR")){limit=1000;}
            else  {limit=0;}

           new CreditAccount(0, currency,limit);
            System.out.println("Кредитный счёт создан. Ваш лимит по счёту "+limit+' '+currency);

        }
       else {
//создать пустой объект BankAccount()
   new EmptyAccaunt();
System.out.println("Неверно указан тип создаваемого счёта");




       }
    }
    // создать метод closeAccount, который принимает на вход переменную типа BankAccount
    public void closeAccount (BankAccount Accaunt){
// если переданный аккаунт дебетовый
        if (Accaunt.currency.equals("debit_account")){
            if (Accaunt.amount==0){
                System.out.println("Ваш дебетовый счёт закрыт");
            }
            else {System.out.println("Ваш дебетовый счёт закрыт. " +
                    "Вы можете получить остаток по вашему счёту в размере "+ Accaunt.amount
            + ' ' + Accaunt.currency);}
        }
        else if (Accaunt.currency.equals("credit_account")){
            if (Accaunt.amount==0){
                System.out.println("Ваш кредитный счёт закрыт");
            }
            if (Accaunt.amount>0){
                System.out.println("Ваш кредитный счёт закрыт." +
                        " Вы можете получить остаток по вашему счёту в размере "
                +Accaunt.amount+ ' ' + Accaunt.currency+
                        " в отделении банка");
            }
            if (Accaunt.amount<0){
                System.out.println("Вы не можете закрыть кредитный счёт, потому как на нём ещё" +
                        " есть задолженность. Ваша задолженность по счёту составляет  "
                        +Math.abs(Accaunt.amount)+ ' ' + Accaunt.currency);
            }

        }
        else {
            System.out.println("Пока что мы не можем закрыть данный вид счёта");
        }
    }

}
