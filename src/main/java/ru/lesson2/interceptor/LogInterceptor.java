package ru.lesson2.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LogInterceptor {

    @AroundInvoke
    public Object log(InvocationContext invocationContext) throws Exception {
        final String method = invocationContext.getMethod().getName();
        System.out.println("Method name " + method);
        return invocationContext.proceed();
    }
}
