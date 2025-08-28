package SplitFactory;

import enums.SplitType;

public class ExpenseSplitFactory {

    ExpenseSplit getExpenseSplit(SplitType splitType){
        switch (splitType){
            case EQUAL_SPLIT :
                return new EqualExpenseSplit();
            case UNEQUAL_SPLIT:
                return new UnequalExpenseSplit();
            case PERCENTAGE_SPLIT:
                return new PercentageExpenseSplit();
            default:
                return null;
        }
    }
}
