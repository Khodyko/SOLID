package com.company.web.task4;

import com.company.web.task3.PayMethod;

public class Card implements PayMethod {
    @Override
    public void pay(Integer rubles) {
        System.out.println("It has been paid "+rubles+ " rubles by card");
    }
}
