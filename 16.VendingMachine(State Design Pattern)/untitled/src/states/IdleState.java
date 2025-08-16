package states;

import machine.VendingMachine;
import java.util.Objects;
import java.util.Scanner;

public class IdleState implements VendingMachineStates {

    public void idleState(VendingMachine vendingMachine) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Click on any button to continue");
        String action = sc.next();

        if(Objects.equals(action, "XXX")) {
            cancelTransaction(vendingMachine);
        } else {
            AcceptCoins acceptCoins = new AcceptCoins();
            acceptCoins.acceptingCoins(vendingMachine);
        }
    }

    public void acceptingCoins(VendingMachine vendingMachine) {
        throw new UnsupportedOperationException("Not applicable in IdleState.");
    }

    public void productSelection(VendingMachine vendingMachine) {
        throw new UnsupportedOperationException("Not applicable in IdleState.");
    }

    public void dispatchProduct(VendingMachine vendingMachine) {
        throw new UnsupportedOperationException("Not applicable in IdleState.");
    }

    public void refundExtraMoney(VendingMachine vendingMachine) {
        throw new UnsupportedOperationException("Not applicable in IdleState.");
    }

    public void cancelTransaction(VendingMachine vendingMachine) {
        throw new UnsupportedOperationException("Not applicable in IdleState.");
    }
}
