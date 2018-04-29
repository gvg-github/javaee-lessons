package ru.lesson2.webservice;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class RestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> result = new HashSet<>();
        result.add(ProductServiceJAX_RS.class);
        return super.getClasses();
    }
}
