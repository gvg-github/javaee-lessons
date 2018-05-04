package ru.lesson2.webservice;

import javax.xml.ws.Endpoint;

public class MyWebPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/myWebService", new MyWebService());
    }
}
