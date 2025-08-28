package SplitFactory;

import entity.Split;

import java.util.List;

public interface ExpenseSplit {

    public boolean validateSplitRequest(List<Split>splitList,double amount);
}
