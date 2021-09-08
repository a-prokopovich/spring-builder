package com.prokopovich.springbuilder.service;

import com.prokopovich.springbuilder.annotation.InjectProperty;
import com.prokopovich.springbuilder.annotation.Singleton;

import javax.annotation.PostConstruct;

@Singleton
@Deprecated
public class RecomendatorImpl implements Recomendator {

    @InjectProperty
    private String alcohol;

    @PostConstruct
    public void init() {
        System.out.println("recomendator was created");
    }

    @Override
    public void recommend() {
        System.out.println("to protect from covid-2019, drink " + alcohol);
    }
}
