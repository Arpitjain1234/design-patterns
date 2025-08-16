package entity;

import java.util.Map;

public class CardManager {

    Map<String, BankAccount> cardBankAccountMap;
    Map<String,Integer> cardPinMap;
    public void updateBankBalance(String cardNumber, TransactionType txntype, int amount){
        if(cardBankAccountMap.containsKey(cardNumber)){
            BankAccount  bankAccount = cardBankAccountMap.get(cardNumber);
            switch (txntype){
                case DEBIT:
                    if(bankAccount.bankBalance < amount){
                        System.out.println("Insufficient Funds");
                    } else {
                        int updatedBalance = bankAccount.bankBalance - amount;
                        bankAccount.bankBalance = updatedBalance;
                        cardBankAccountMap.put(cardNumber, bankAccount);
                        System.out.println("Operation successful");
                    }
                    break;

                case CREDIT:
                    int updatedBalance = bankAccount.bankBalance + amount;
                    bankAccount.bankBalance = updatedBalance;
                    cardBankAccountMap.put(cardNumber, bankAccount);
                    System.out.println("Operation successful");
                    break;
            }

        }

    }

    public boolean validatePin(String cardNumber, int pin){
        if(cardPinMap.containsKey(cardNumber)){
            return cardPinMap.get(cardNumber)==pin;

        }
        return  false;
    }


}
