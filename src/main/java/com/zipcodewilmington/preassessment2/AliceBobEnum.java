package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    ALICE("ALICE"),
    BOB("BOB");

    private String value;

    AliceBobEnum(String str) {
        this.value = str;
    }
    public String getValue(){
        return value;
    }
}
