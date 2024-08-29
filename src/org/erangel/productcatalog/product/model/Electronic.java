package org.erangel.productcatalog.product.model;

abstract public class Electronic extends Product implements IElectronic{
    protected String Manufacturer;

    public Electronic(int price, String manufacturer) {
        super(price);
        Manufacturer = manufacturer;
    }
    public String getManufacturer() {
        return Manufacturer;
    }


}
