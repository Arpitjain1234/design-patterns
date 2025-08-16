package states;

import machine.VendingMachine;

public interface VendingMachineStates {
    public void idleState(VendingMachine vendingMachine);
    public void acceptingCoins(VendingMachine vendingMachine);
    public void productSelection(VendingMachine vendingMachine);
    public void dispatchProduct(VendingMachine vendingMachine);
    public void refundExtraMoney(VendingMachine vendingMachine);
    public void cancelTransaction(VendingMachine vendingMachine);
}
