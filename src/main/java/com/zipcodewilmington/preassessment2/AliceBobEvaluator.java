package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {
    String string;
    String alice = AliceBobEnum.ALICE.getValue();
    String bob = AliceBobEnum.BOB.getValue();

    public AliceBobEvaluator(String input) {
        this.string = input;
    }

    public boolean isAlice(){
        if(string.equalsIgnoreCase(alice))
            return true;
        else
            return false;
    }
    public boolean isBob(){
        if(string.equalsIgnoreCase(bob))
            return true;
        else
            return false;
    }
}
