package entity;

public class BankAccount {
    String bankAccountNumber;
    String IFSC;
    String branchCode;
    String bankAccountHolderName;
    public int bankBalance;
    // address

    BankAccount(String bankAccountNumber, String IFSC, String branchCode, String bankAccountHolderName,int bankBalance){
        this.bankAccountNumber = bankAccountNumber;
        this.IFSC = IFSC;
        this.branchCode = branchCode;
        this.bankAccountHolderName = bankAccountHolderName;
        this.bankBalance = bankBalance;
    }
}
