package com.prokopovich.springbuilder.service;

import com.prokopovich.springbuilder.annotation.InjectByType;

public class AngryPoliceman implements Policeman {

    @InjectByType
    private Recomendator recomendator;

    @Override
    public void makePeopleLeaveRoom() {
        System.out.println("Всех убью! Вон пошли");
    }
}
