package ru.lesson2.service;

import javax.xml.ws.Endpoint;

public class PublisherJAX_WS {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/webservice", new ProductServiceJAX_WS());
    }
}
