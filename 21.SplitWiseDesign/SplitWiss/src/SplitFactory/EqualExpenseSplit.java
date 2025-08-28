package SplitFactory;

import entity.Split;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit {
    public boolean validateSplitRequest(List<Split> splitList, double amount){
        double amountRecalculated = 0;
        for(Split split : splitList){
            amountRecalculated = amountRecalculated + split.amountOwed;
        }
        if(amount == amountRecalculated){
            return true;
        }
        return false;
    }
}
