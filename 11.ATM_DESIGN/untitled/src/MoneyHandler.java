public abstract class MoneyHandler {

    MoneyHandler nextMoneyHandler;

    void dispatchCash(int amount){
        if(nextMoneyHandler!=null){
            nextMoneyHandler.dispatchCash(amount);
        }
    }
}
