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

}
