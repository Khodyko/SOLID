package com.company.web.task10.service;

import com.company.web.task10.repository.IRepository;

public class Service implements IService {
    IRepository repository;

    public Service(IRepository repository) {
        this.repository = repository;
    }

    @Override
    public String getName() {
        return repository.getName();
    }
}
