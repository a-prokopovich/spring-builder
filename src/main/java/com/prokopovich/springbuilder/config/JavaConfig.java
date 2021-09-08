package com.prokopovich.springbuilder.config;

import lombok.Getter;
import org.reflections.Reflections;

import java.util.Map;
import java.util.Set;

public class JavaConfig implements Config {

    @Getter
    private Reflections scanner;
    private Map<Class, Class> ifc2ImplClass;

    public JavaConfig(String packageToScan, Map<Class, Class> ifc2ImplClass) {
        this.scanner = new Reflections(packageToScan);
        this.ifc2ImplClass = ifc2ImplClass;
    }

    @Override
    public <T> Class<? extends T> getImplClass(Class<T> inf) {
        return ifc2ImplClass.computeIfAbsent(inf, aClass -> {
            Set<Class<? extends T>> classes = scanner.getSubTypesOf(inf);
            if (classes.size() != 1) {
                throw new RuntimeException(inf + " has 0 or more than one impl, please update your config");
            }

            return classes.iterator().next();
        });
    }
}
