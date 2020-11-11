package org.hbrs.ooka.ws2020.uebung1.objects;

public class Hotel {
    private String name;
    private String location;

    public Hotel(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }
    public String getLocation(){
        return location;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
