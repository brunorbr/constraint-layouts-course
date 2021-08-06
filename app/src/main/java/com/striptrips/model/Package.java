package com.striptrips.model;

import java.math.BigDecimal;

public class Package {
    private final String location;
    private final String image;
    private final int amountOfDays;
    private final BigDecimal price;

    public Package(String location, String image, int amountOfDays, BigDecimal price) {
        this.location = location;
        this.image = image;
        this.amountOfDays = amountOfDays;
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public String getImage() {
        return image;
    }

    public int getAmountOfDays() {
        return amountOfDays;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
