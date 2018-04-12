package ru.lesson2.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns="/*")
public class PageFilter implements javax.servlet.Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setAttribute("code", "UTF-8");
        chain.doFilter(request, response);
    }

    public void destroy() {

    }
}
