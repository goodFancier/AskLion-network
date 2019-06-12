package com.messager.Entity;

public class Data implements DomainObject {

    private String id;

    private String name;

    public Data(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Data(String id, String name, String lat, String lon) {
        this.id = id;
        this.name = name;
        this.lat = lat;
        this.lon = lon;
    }

    private String lat;

    private String lon;
}
