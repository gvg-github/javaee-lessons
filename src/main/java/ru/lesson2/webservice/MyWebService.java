package ru.lesson2.webservice;

import ru.lesson2.dao.CategoryDAO;
import ru.lesson2.dao.ProductDAO;
import ru.lesson2.dto.ProductRecord;
import ru.lesson2.entity.Category;
import ru.lesson2.entity.Product;

import javax.ejb.EJB;
import javax.jws.WebService;
import java.util.List;

@javax.jws.WebService(endpointInterface = "ru.lesson2.webservice.WebServiceInterface")
public class MyWebService implements WebServiceInterface {

//    @Inject
//    private ProductDAO productDAO;
//
//    @Inject
//    private CategoryDAO categoryDAO;

    @EJB
    private ProductDAO productDAO;

    @EJB
    private CategoryDAO categoryDAO;

    @Override
    public void createCatregoryByName(
            String name
    ) {
        final Category category = new Category();
        category.setName(name);
        categoryDAO.merge(category);
    }

    @Override
    public List<ProductRecord> getListProduct() {
        return ProductRecord.toList(productDAO.getListProduct());
    }

    @Override
    public List<ProductRecord> getListProductWithCategoryId(
            String id
    ) {
        return ProductRecord.toList(productDAO.getListProductByCategoryId(id));
    }

    @Override
    public void createProductByName(
            String name
    ) {
        final Product product = new Product();
        product.setName(name);
        product.setDescription("");
        productDAO.merge(product);
    }

    @Override
    public ProductRecord getProductById(
            String id
    ) {
        Product product = productDAO.getProductById(id);
        if (product == null) return null;
        return new ProductRecord(product);
    }

    @Override
    public ProductRecord getProductByName(
            String name
    ) {
        Product product = productDAO.getProductByName(name);
        if (product == null) return null;
        return new ProductRecord(product);
    }

    @Override
    public void removeProductById(
            String id
    ) {
        productDAO.removeProduct(id);
    }

}
