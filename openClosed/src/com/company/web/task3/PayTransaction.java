package com.company.web.task3;

public class PayTransaction {
    private PayMethod payMethod;
    private Integer summ;

    public PayTransaction(PayMethod payMethod, Integer summ) {
        this.payMethod = payMethod;
        this.summ = summ;
    }

    public void pay() {
        payMethod.pay(summ);
    }
}
