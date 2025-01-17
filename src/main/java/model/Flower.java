package model;

import java.math.BigDecimal;

public class Flower {
    String name;
    String description;
    BigDecimal price;

    public Flower(String name, String description, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
