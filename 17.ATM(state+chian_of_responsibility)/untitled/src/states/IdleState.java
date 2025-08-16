package states;

import entity.ATM;
import entity.Card;
import entity.TransactionType;
import java.util.Scanner;
public class IdleState extends AtmState {
    public void insertCard(ATM atm, Card card) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert card here , and click ok");
        String cardNumber = sc.nextLine();
        AtmState atmState = new HasCardState();
        atm.setCurrentATMState(atmState);
    }

    public void authenticatePin(ATM atm, Card card, int pin){
        System.out.println("OOPS!! Something went wrong");
    }

    public void selectOperation(ATM atm, Card card, TransactionType txnType){
        System.out.println("OOPS!! Something went wrong");
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
