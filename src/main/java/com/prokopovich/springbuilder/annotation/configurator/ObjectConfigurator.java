package com.prokopovich.springbuilder.annotation.configurator;

import com.prokopovich.springbuilder.context.ApplicationContext;

public interface ObjectConfigurator {

    void configure(Object t, ApplicationContext context);
}
