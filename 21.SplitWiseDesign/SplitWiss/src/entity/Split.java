package entity;

public class Split {
    User user;
    public double amountOwed;

    public Split(User user, double amountOwed){
        this.user = user;
        this.amountOwed = amountOwed;
    }

}
