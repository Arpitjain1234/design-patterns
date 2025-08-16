package states;
import machine.VendingMachine;

import java.util.Objects;
import java.util.Scanner;
public class Refund implements VendingMachineStates{

    public void idleState(VendingMachine vendingMachine){
        Scanner sc = new Scanner(System.in);
        String action = sc.next();
        System.out.println("Click on any button to continue");

        if(Objects.equals(action, "XXX")){
            Refund refund = new Refund();
            refund.cancelTransaction(vendingMachine);
        }



    }
    public void acceptingCoins(VendingMachine vendingMachine){
        throw new UnsupportedOperationException("Not applicable in IdleState.");
    }
    public void productSelection(VendingMachine vendingMachine){
        throw new UnsupportedOperationException("Not applicable in IdleState.");
    }
    public void dispatchProduct(VendingMachine vendingMachine){
        throw new UnsupportedOperationException("Not applicable in IdleState.");
    }
    public void refundExtraMoney(VendingMachine vendingMachine){
        throw new UnsupportedOperationException("Not applicable in IdleState.");
    }
    public void cancelTransaction(VendingMachine vendingMachine){
        throw new UnsupportedOperationException("Not applicable in IdleState.");
    }
}
