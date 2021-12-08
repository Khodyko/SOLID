package com.company.web.task5;

public class ChildCar extends ParentCar {

    public ChildCar(Integer speed) {
        super(speed);
        System.out.println("speed: "+speed);
    }

    public void pushGasPedal() {
        speed = speed + 10;
        System.out.println("speed: "+speed);
    }

    public void pushBrakePedal() {
        if (speed - 10 <= 0) {
            speed = 0;
            System.out.println("car has stopped");
        } else {
            speed = speed - 10;
            System.out.println("speed: "+speed);
        }
    }
}
