package CashWithdraw;

public class Handler50 extends MoneyHandler {

    void dispatchCash(int amount){
        int rem = amount%50;
        if(amount>=50){
            int notes = amount/50;
            System.out.println("50 X "+notes);
        }
        super.dispatchCash(rem);
    }
}
