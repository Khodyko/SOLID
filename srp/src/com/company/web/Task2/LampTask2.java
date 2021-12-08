package com.company.web.Task2;

public class LampTask2 {
    private Boolean isBulbOn;
    private Boolean isPlugOn;
    private Boolean isTumblerOn;

    public LampTask2() {
        isBulbOn = false;
        isPlugOn = false;
        isTumblerOn = false;
    }
    public void turnPlugOnOff(Boolean turnOn) {
        isPlugOn=turnOn;
        changeBulbCondition();
    }
    public void turnTumblerOnOff(Boolean turnOn) {
        isTumblerOn=turnOn;
        changeBulbCondition();
    }

    private void changeBulbCondition() {
        if (isPlugOn && isTumblerOn) {
           isBulbOn=true;
        } else {
            isBulbOn=false;
        }
    }
}
