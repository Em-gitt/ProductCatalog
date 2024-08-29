package org.erangel.productcatalog.product;

import org.erangel.productcatalog.product.model.Electronic;

public class TvLcd extends Electronic {
    private int inches;

    public TvLcd(int price, String manufacturer, int inches) {
        super(price, manufacturer);
        this.inches = inches;
    }
    public int getInches() {
        return inches;
    }

    @Override
    public double getPriceSale() {
        return price * 0.9;
    }
}
