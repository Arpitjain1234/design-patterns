package entity;

public class Card {
    public String cardNumber;
    int pin;
    public BankAccount bankAccount;
    // expiry date
    // cvv number
    Card(String cardNumber, int pin, BankAccount bankAccount) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.bankAccount = bankAccount;
    }

}
