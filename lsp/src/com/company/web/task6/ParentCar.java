package com.company.web.task6;

public class ParentCar {
    Integer speed;

    public ParentCar(Integer speed) {
        if (speed <= 0) {
            System.out.println("car has stopped speed=0");
            this.speed = 0;
        } else {
            this.speed = speed;
        }

    }

    public void pushGasPedal() {
        speed = speed + 10;
    }

    public void pushBrakePedal() {
        if (speed - 10 <= 0) {
            speed = 0;
            System.out.println("car has stopped");
        } else {
            speed = speed - 10;
        }
    }

}
