package ru.lesson2.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import ru.lesson2.dto.ProductRecord;
import java.util.List;

@WebService
public interface WebServiceInterface {

    @WebMethod
    public void createCatregoryByName(
            @WebParam(name = "name", partName = "name") String name
    );

    @WebMethod
    public List<ProductRecord> getListProduct();

    @WebMethod
    public List<ProductRecord> getListProductWithCategoryId(
            @WebParam(name = "id", partName = "id") String id
    );

    @WebMethod
    public void createProductByName(
            @WebParam(name = "name", partName = "name") String name
    );

    @WebMethod
    public ProductRecord getProductById(
            @WebParam(name = "id", partName = "id") String id
    );

    @WebMethod
    public ProductRecord getProductByName(
            @WebParam(name = "name", partName = "name") String name
    );

    @WebMethod
    public void removeProductById(
            @WebParam(name = "id", partName = "id") String id
    );
}
