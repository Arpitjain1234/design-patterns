public class Main {
    public static void main(String[] args) {
        MoneyHandler moneyHandler2000 = new Handler2000();
        MoneyHandler moneyHandler500 = new Handler500();
        MoneyHandler moneyHandler100 = new Handler100();
        MoneyHandler moneyHandler50 = new Handler50();

        moneyHandler2000.nextMoneyHandler = moneyHandler500;
        moneyHandler500.nextMoneyHandler = moneyHandler100;
        moneyHandler100.nextMoneyHandler = moneyHandler50;

        moneyHandler2000.dispatchCash(5);


    }
}