package com.prokopovich.springbuilder.config;

public interface ProxyConfigurator {

    Object replaceWithProxyIfNeeded(Object t, Class implClass);
}
