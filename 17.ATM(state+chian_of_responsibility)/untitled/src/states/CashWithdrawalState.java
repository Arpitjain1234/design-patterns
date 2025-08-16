package states;

import entity.ATM;
import entity.Card;
import entity.TransactionType;
import java.util.Scanner;
import CashWithdraw.*;
public class CashWithdrawalState extends AtmState{
    public CashWithdrawalState(){
        System.out.println("Enter amount to withdraw ");
    }


    @Override
    public void cashWithdrawal(ATM atm, Card card, int withdrawAmount){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        if(card.bankAccount.bankBalance<withdrawAmount){
            System.out.println("Insufficient  balance");
            exit(atm);
        }
        MoneyHandler moneyHandler2000 = new Handler2000();
        MoneyHandler moneyHandler500 = new Handler500();
        MoneyHandler moneyHandler100 = new Handler100();
        MoneyHandler moneyHandler50 = new Handler50();

        moneyHandler2000.nextMoneyHandler = moneyHandler500;
        moneyHandler500.nextMoneyHandler = moneyHandler100;
        moneyHandler100.nextMoneyHandler = moneyHandler50;

        moneyHandler2000.dispatchCash(amount);
        atm.cardManager.updateBankBalance(card.cardNumber,TransactionType.DEBIT, amount);
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
