package org.erangel.productcatalog.product;

import org.erangel.productcatalog.product.model.Electronic;

public class IPhone extends Electronic {
    private String color;
    private String model;

    public IPhone(int price, String manufacturer, String color, String model) {
        super(price, manufacturer);
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    @Override
    public double getPriceSale() {
        return price * 0.9;
    }
}
