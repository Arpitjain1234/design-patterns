package entity;

public class User {
    String name;
    String email;
    String contactNo;
    UserBalanceSheet userBalanceSheet;

    public User(String name, String email, String contactNo, UserBalanceSheet userBalanceSheet){
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
        this.userBalanceSheet = userBalanceSheet;
    }


}
