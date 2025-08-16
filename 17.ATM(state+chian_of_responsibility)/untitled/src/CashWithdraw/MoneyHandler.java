package CashWithdraw;

public abstract class MoneyHandler {

    public MoneyHandler nextMoneyHandler;

    public void dispatchCash(int amount){
        if(nextMoneyHandler!=null){
            nextMoneyHandler.dispatchCash(amount);
        }
    }
}
