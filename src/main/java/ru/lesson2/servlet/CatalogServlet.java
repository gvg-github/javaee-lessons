package ru.lesson2.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/catalog")
public class CatalogServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().println("Hello");
//        List<Product> products = new ArrayList<Product>();
//        products.add(new Product(100, "Product1"));
//        products.add(new Product(200, "Product2"));
//        products.add(new Product(300, "Product3"));
//        products.add(new Product(400, "Product4"));
//        products.add(new Product(500, "Product5"));
//        products.add(new Product(600, "Product6"));
//        products.add(new Product(700, "Product7"));
//        products.add(new Product(800, "Product8"));
//        products.add(new Product(900, "Product9"));

//        req.setAttribute("products", products);
//        req.setAttribute("namePage", "Catalog page");
//        req.getRequestDispatcher("catalog.jsp").forward(req, resp);
    }
}
