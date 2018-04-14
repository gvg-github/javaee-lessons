package ru.lesson2.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/catalog")
public class CatalogServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().println("Hello");
        List<String> products = new ArrayList<String>();
        products.add("Product1");
        products.add("Product2");
        products.add("Product3");
        products.add("Product4");
        products.add("Product5");
        products.add("Product6");
        products.add("Product7");
        products.add("Product8");
        products.add("Product9");
        req.setAttribute("products", products);
        req.setAttribute("namePage", "Catalog page");
        req.getRequestDispatcher("catalog.jsp").forward(req, resp);
    }
}
