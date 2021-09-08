package com.prokopovich.springbuilder.service;

import com.prokopovich.springbuilder.annotation.InjectByType;

public class PolicemanImpl implements Policeman {

    @InjectByType
    private Recomendator recomendator;

    public PolicemanImpl() {
        System.out.println(recomendator.getClass());
    }

    @Override
    public void makePeopleLeaveRoom() {
        System.out.println("пиф. паф, бах, бах, кыш, кыш");
    }
}
