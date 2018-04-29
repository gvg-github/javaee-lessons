package ru.lesson2.webservice;

import ru.lesson2.dao.CategoryDAO;
import ru.lesson2.dao.ProductDAO;
import ru.lesson2.dto.ProductRecord;
import ru.lesson2.entity.Category;
import ru.lesson2.entity.Product;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@WebService()
public class ProductServiceJAX_WS {

    @Inject
    private ProductDAO productDAO;

    @Inject
    private CategoryDAO categoryDAO;

    @WebMethod
    public void createCatregoryByName(
            @WebParam(name = "name", partName = "name") String name
    ) {
        final Category category = new Category();
        category.setName(name);
        categoryDAO.merge(category);
    }

    @WebMethod
    public List<ProductRecord> getListProduct() {
        return ProductRecord.toList(productDAO.getListProduct());
    }

    @WebMethod
    public List<ProductRecord> getListProductWithCategoryId(
            @WebParam(name = "id", partName = "id") String id
    ) {
        return ProductRecord.toList(productDAO.getListProductByCategoryId(id));
    }

    @WebMethod
    public void createProductByName(
            @WebParam(name = "name", partName = "name") String name
    ) {
        final Product product = new Product();
        product.setName(name);
        product.setDescription("");
        productDAO.merge(product);
    }

    @WebMethod
    public ProductRecord getProductById(
            @WebParam(name = "id", partName = "id") String id
    ) {
        Product product = productDAO.getProductById(id);
        if (product == null) return null;
        return new ProductRecord(product);
    }

    @WebMethod
    public ProductRecord getProductByName(
            @WebParam(name = "name", partName = "name") String name
    ) {
        Product product = productDAO.getProductByName(name);
        if (product == null) return null;
        return new ProductRecord(product);
    }

    @WebMethod
    public void removeProductById(
            @WebParam(name = "id", partName = "id") String id
    ) {
        productDAO.removeProduct(id);
    }

}
