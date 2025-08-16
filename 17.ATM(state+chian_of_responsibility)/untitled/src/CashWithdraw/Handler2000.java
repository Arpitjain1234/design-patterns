package CashWithdraw;

public class Handler2000 extends MoneyHandler {
    void dispatchCash(int amount){
        int rem = amount%2000;
        if(amount>=2000){
            int notes = amount/2000;
            System.out.println("2000 X "+notes);
        }
        super.dispatchCash(rem);
    }
}
