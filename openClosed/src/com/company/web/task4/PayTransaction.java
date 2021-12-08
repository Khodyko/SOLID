package com.company.web.task4;

import com.company.web.task3.PayMethod;

public class PayTransaction {

    public PayTransaction() {

    }

    public void payByCard(Card card,Integer summ) {
        card.pay(summ);
    }
    public void payByCash(Cash cash, Integer summ) {
        cash.pay(summ);
    }
}
