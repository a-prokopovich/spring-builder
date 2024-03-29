package com.prokopovich.springbuilder.config;

import org.reflections.Reflections;

public interface Config {

    <T> Class<? extends T> getImplClass(Class<T> inf);

    Reflections getScanner();
}
