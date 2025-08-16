package CashWithdraw;

public class Handler500 extends MoneyHandler {
    void dispatchCash(int amount){
        int rem = amount%500;
        if(amount>=500){
            int notes = amount/500;
            System.out.println("500 X "+notes);
        }
        super.dispatchCash(rem);
    }
}
