package entity;

public class User {

    BankAccount bankAccount;
    Card card;


    User(BankAccount bankAccount, Card card){
        this.bankAccount = bankAccount;
        this.card = card;
    }

}
