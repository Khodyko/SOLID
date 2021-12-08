package com.company.web.Task1;

public class Bulb {
    private Boolean on = false;

    public Bulb() {
    }

    public Boolean getOn() {
        return on;
    }

    public void setOn(Boolean on) {
        this.on = on;
        if(on==true){
            System.out.println("let there be light");
        }
        else{
            System.out.println("darkness filled the room");
        }
    }
}
