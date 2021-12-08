package com.company.web.task3;

public class Card implements PayMethod{
    @Override
    public void pay(Integer rubles) {
        System.out.println("It has been paid "+rubles+ " rubles by card");
    }
}
