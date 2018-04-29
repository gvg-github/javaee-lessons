package ru.lesson2.webservice;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class ClientJAX_WS {

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:9999/ws/productService?wsdl");
        QName qname = new QName("http://webservice.lesson2.ru/", "ProductServiceJAX_WSService");

        Service service = Service.create(url, qname);
        ProductServiceJAX_WS test = service.getPort(ProductServiceJAX_WS.class);

    }

}

