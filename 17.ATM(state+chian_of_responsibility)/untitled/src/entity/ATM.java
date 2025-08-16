package entity;

import states.AtmState;

public class ATM {
    AtmState currentAtmState;
    public CardManager cardManager;

    ATM(AtmState atmState){
        this.currentAtmState = atmState;

    }
    ATM(AtmState atmState, CardManager cardManager){
        this.currentAtmState = atmState;
        this.cardManager = cardManager;

    }


    public void setCurrentATMState(AtmState currentATMState) {
        this.currentAtmState = currentATMState;
    }


}
