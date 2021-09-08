package com.prokopovich.springbuilder.service;

import com.prokopovich.springbuilder.data.Room;
import com.prokopovich.springbuilder.annotation.InjectByType;

@Deprecated
public class CoronaDesinfector {

    @InjectByType
    private Announcer announcer;
    @InjectByType
    private Policeman policeman;

    public void start(Room room) {

        // сообщить всем присутствующим в комнате о начале дезинфекции и попросить выйти
        announcer.announce("Начиаем дезинфекцию, все вон!");

        // разогнать всех, кто не вышел после объявления
        policeman.makePeopleLeaveRoom();

        desinfect(room);

        // сообщить всем что они могут вернуться обратно
        announcer.announce("Рискните зайти обратно!");

    }

    private void desinfect(Room room) {
        System.out.println("зачитывается молитва: 'корона изыди' - молитва прочитана, вирус низвергнут в ад");
    }
}
