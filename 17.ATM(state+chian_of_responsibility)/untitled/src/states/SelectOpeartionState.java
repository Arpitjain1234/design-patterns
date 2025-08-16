package states;

import entity.ATM;
import entity.Card;
import entity.TransactionType;
import java.util.Scanner;
public class SelectOpeartionState extends AtmState{
    public SelectOpeartionState(){
        System.out.println("Choose from the following operations");
        System.out.println("Press 1 for cashWithdrawal");
        System.out.println("Press 2 to  displayBalance");

    }
    @Override
    public void selectOperation(ATM atm, Card card, TransactionType txnType){
        Scanner sc =  new Scanner(System.in);
        int op = sc.nextInt();
        switch (op){
            case 2:
                int balance = card.bankAccount.bankBalance;
                System.out.println("your current balance is : "+balance);
                break;
            case 1:
                System.out.println("Enter amount : ");
                int ampount = sc.nextInt();
                break;
            default:
                returnCard();
        }

    }

    public void cashWithdrawal(ATM atm, Card card, int withdrawAmount){
        System.out.println("OOPS!! Something went wrong");
    }

    public void displayBalance(ATM atm, Card card){
        System.out.println("OOPS!! Something went wrong");
    }

    public void returnCard(){
        System.out.println("OOPS!! Something went wrong");
    }

    public void exit(ATM atm){
        System.out.println("OOPS!! Something went wrong");
    }
}
