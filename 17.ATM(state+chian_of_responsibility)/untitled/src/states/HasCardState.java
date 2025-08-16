package states;

import entity.ATM;
import entity.Card;
import entity.CardManager;
import entity.TransactionType;

import java.util.Scanner;

public class HasCardState extends AtmState{

    public HasCardState(){
        System.out.println("Enter your pin and click enter");
    }
    @Override
    public void authenticatePin(ATM atm, Card card, int pin){
        if(atm.cardManager.validatePin(card.cardNumber,pin)){
            System.out.println("Pin verified successfully");
            atm.setCurrentATMState(new SelectOpeartionState());
        }
        System.out.println("Incorrect pin ");
        exit(atm);
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
