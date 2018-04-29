package ru.lesson2.service;

import ru.lesson2.dao.CategoryDAO;
import ru.lesson2.dao.ProductDAO;
import ru.lesson2.dto.ProductRecord;
import ru.lesson2.entity.Category;
import ru.lesson2.entity.Product;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/restService")
@WebService
public class ProductServiceJAX_RS {

    @Inject
    private ProductDAO productDAO;

    @Inject
    private CategoryDAO categoryDAO;

    @GET
    @Path("/getListProduct")
    @WebMethod
    @Produces({MediaType.APPLICATION_JSON})
    public List<ProductRecord> getListProduct() {
        return ProductRecord.toList(productDAO.getListProduct());
    }

    @GET
    @Path("/getListProductWithCategoryId")
    @WebMethod
    @Produces({MediaType.APPLICATION_JSON})
    public List<ProductRecord> getListProductWithCategoryId(
            @QueryParam(value = "id") @WebParam(name = "id", partName = "id") String id
    ) {
        return ProductRecord.toList(productDAO.getListProductByCategoryId(id));
    }

    @GET
    @Path("/createProductByName")
    @WebMethod
    @Produces({MediaType.APPLICATION_JSON})
    public boolean createProductByName(
            @QueryParam(value = "name") @WebParam(name = "name", partName = "name") String name
    ) {
        try {
            final Product product = new Product();
            product.setName(name);
            product.setDescription("");
            productDAO.merge(product);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @GET
    @Path("/createCatregoryByName")
    @WebMethod
    @Produces({MediaType.APPLICATION_JSON})
    public boolean createCatregoryByName(
            @QueryParam(value = "name") @WebParam(name = "name", partName = "name") String name
    ) {
        try {
            final Category category = new Category();
            category.setName(name);
            categoryDAO.merge(category);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @GET
    @Path("/getProductById")
    @WebMethod
    @Produces({MediaType.APPLICATION_JSON})
    public ProductRecord getProductById(
            @QueryParam(value = "id") @WebParam(name = "id", partName = "id") String id
    ) {
        Product product = productDAO.getProductById(id);
        if (product == null) return null;
        return new ProductRecord(product);
    }

    @GET
    @Path("/getProductById")
    @WebMethod
    @Produces({MediaType.APPLICATION_JSON})
    public ProductRecord getProductByName(
            @QueryParam(value = "name") @WebParam(name = "name", partName = "name") String name
    ) {
        Product product = productDAO.getProductByName(name);
        if (product == null) return null;
        return new ProductRecord(product);
    }

    @GET
    @Path("/removeProductById")
    @WebMethod
    @Produces({MediaType.APPLICATION_JSON})
    public boolean removeProductById(
            @QueryParam(value = "id") @WebParam(name = "id", partName = "id") String id
    ) {
        try {
            productDAO.removeProduct(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
