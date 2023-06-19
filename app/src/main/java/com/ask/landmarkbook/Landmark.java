package com.ask.landmarkbook;

import java.io.Serializable;

public class Landmark implements Serializable {
    String name;
    String country;
    int image;
    String description;

    public Landmark(String name, String country, int image, String description) {
        this.name = name;
        this.country = country;
        this.image = image;
        this.description = description;
    }
}
