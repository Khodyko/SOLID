package com.company.web.task3;

public class Cash implements PayMethod{
    @Override
    public void pay(Integer rubles) {
        System.out.println("It has been paid "+rubles+ " rubles by cash");
    }
}
