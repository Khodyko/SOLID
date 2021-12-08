package com.company.web.Task7;

public class CallWebPhone implements IWeb, ICall{
    @Override
    public void call() {
        System.out.println("we call, actually");
    }

    @Override
    public void web() {
        System.out.println("we go to internet, actually");
    }
}
