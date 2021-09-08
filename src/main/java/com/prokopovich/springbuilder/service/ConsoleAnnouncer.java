package com.prokopovich.springbuilder.service;

import com.prokopovich.springbuilder.annotation.InjectByType;

public class ConsoleAnnouncer implements Announcer {

    @InjectByType
    private Recomendator recomendator;

    @Override
    public void announce(String message) {
        System.out.println(message);
        recomendator.recommend();
    }
}
