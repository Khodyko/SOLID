package com.company.web.Task1;

public class LampTask1 {
    private Plug plug;
    private Tumbler tumbler;
    private Bulb bulb;

    public LampTask1() {
        plug = new Plug();
        tumbler = new Tumbler();
        bulb = new Bulb();
    }

    public void turnPlugOnOff(Boolean turnOn) {
        plug.setOn(turnOn);
        changeBulbCondition();
    }

    public void turnTumblerOnOff(Boolean turnOn) {
        tumbler.setOn(turnOn);
        changeBulbCondition();
    }

    private void changeBulbCondition() {
        if (plug.getOn() && tumbler.getOn()) {
            bulb.setOn(true);
        } else {
            bulb.setOn(false);
        }
    }
}
