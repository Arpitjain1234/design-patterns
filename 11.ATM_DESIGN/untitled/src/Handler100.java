public class Handler100 extends MoneyHandler{
    void dispatchCash(int amount){
        int rem = amount%100;
        if(amount>=100){
            int notes = amount/100;
            System.out.println("100 X "+notes);
        }
        super.dispatchCash(rem);
    }
}
