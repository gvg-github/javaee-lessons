package ru.lesson2.webservice;

import javax.xml.ws.WebServiceRef;

public class MyWebClient {

    @WebServiceRef(wsdlLocation = "http://localhost:9999/ws/myWebService?WSDL")
    private static ServiceJAXWSService service;

    public static void main(String[] args) throws Exception {

        IServiceJAXWS port = service.getServiceJAXWSPort();
        for (ProductRecord record: port.getListProduct()
             ) {
            System.out.println(record.getName());
        }
    }

}

