package ru.lesson2.controller;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

public class AbstractController {

    protected String getParamString(String paramName) {
        return getHttpServletRequest().getParameter(paramName);
    }

    public HttpServletRequest getHttpServletRequest() {
        final FacesContext context = FacesContext.getCurrentInstance();
        return (HttpServletRequest) context.getExternalContext().getRequest();
    }
}
