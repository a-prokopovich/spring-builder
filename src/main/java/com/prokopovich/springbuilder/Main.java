package com.prokopovich.springbuilder;

import com.prokopovich.springbuilder.context.ApplicationContext;
import com.prokopovich.springbuilder.data.Room;
import com.prokopovich.springbuilder.service.AngryPoliceman;
import com.prokopovich.springbuilder.service.CoronaDesinfector;
import com.prokopovich.springbuilder.service.Policeman;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = Application.run("com.prokopovich.springbuilder",
            new HashMap<>(Map.of(Policeman.class, AngryPoliceman.class)));
        CoronaDesinfector desinfector = context.getObject(CoronaDesinfector.class);
        desinfector.start(new Room());
    }
}
