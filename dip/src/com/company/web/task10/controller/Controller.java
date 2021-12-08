package com.company.web.task10.controller;

import com.company.web.task10.service.IService;

public class Controller {
    IService service;

    public Controller(IService service) {
        this.service = service;
    }

    String getUserName() {
        return service.getName();
    }
}
