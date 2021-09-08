package com.prokopovich.springbuilder;

import com.prokopovich.springbuilder.config.JavaConfig;
import com.prokopovich.springbuilder.context.ApplicationContext;
import com.prokopovich.springbuilder.factory.ObjectFactory;

import java.util.Map;

public class Application {

    public static ApplicationContext run(String packageToScan, Map<Class, Class> ifc2ImplClass) {
        JavaConfig config = new JavaConfig(packageToScan, ifc2ImplClass);
        ApplicationContext context = new ApplicationContext(config);
        ObjectFactory objectFactory = new ObjectFactory(context);
        context.setFactory(objectFactory);
        return context;
    }
}
