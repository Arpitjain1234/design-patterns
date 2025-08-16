package states;

import machine.VendingMachine;
import java.util.Objects;
import java.util.Scanner;

public class AcceptCoins implements VendingMachineStates {

    public void idleState(VendingMachine vendingMachine) {
        throw new UnsupportedOperationException("Not applicable in AcceptCoins state.");
    }

    public void acceptingCoins(VendingMachine vendingMachine) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert coins (1, 2, 5, 10)");
        System.out.println("Press 'X' to finish inserting coins");
        System.out.println("Press 'C' to cancel transaction");
        
        String input = sc.next();
        if (Objects.equals(input, "C")) {
            cancelTransaction(vendingMachine);
        } else if (Objects.equals(input, "X")) {
            SelectProducts selectProducts = new SelectProducts();
            selectProducts.productSelection(vendingMachine);
        }
        vendingMachine.
    }

    public void productSelection(VendingMachine vendingMachine) {
        throw new UnsupportedOperationException("Not applicable in AcceptCoins state.");
    }

    public void dispatchProduct(VendingMachine vendingMachine) {
        throw new UnsupportedOperationException("Not applicable in AcceptCoins state.");
    }

    public void refundExtraMoney(VendingMachine vendingMachine) {
        throw new UnsupportedOperationException("Not applicable in AcceptCoins state.");
    }

    public void cancelTransaction(VendingMachine vendingMachine) {
        Refund refund = new Refund();
        refund.refundExtraMoney(vendingMachine);
    }
}
