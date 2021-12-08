package com.company.web.task6;

public class ChildCar extends ParentCar {

    public ChildCar(Integer speed) {
        super(speed);
        System.out.println("speed: "+speed);
    }

    public void pushBrakePedal() {
        speed = speed + 10;
        System.out.println("speed: "+speed);
    }

    public void pushGasPedal() {
        if (speed - 10 <= 0) {
            speed = 0;
            System.out.println("car has stopped");
        } else {
            speed = speed - 10;
            System.out.println("speed: "+speed);
        }
    }
}
