package org.erangel.productcatalog;
import org.erangel.productcatalog.product.model.*;
import org.erangel.productcatalog.product.*;

import java.time.LocalDate;

public class ExampleProductCatalog {
    public static void main(String[] args) {
        IProduct[] products = new Product[6];

        products[0] = new IPhone(299, "Apple", "3G", "Black");
        products[1] = new IPhone(399, "Apple", "4G", "White");
        products[2] = new TvLcd(340, "Sony", 40);
        products[3] = new Book(18, LocalDate.of(2024, 8, 15), "Eric Gamma", "Reusable OOP Elements", "Some...");
        products[4] = new Book(14, LocalDate.of(2023, 12, 25), "Martin Fowler", "UML Distilled", "Some...");
        products[5] = new Comics(5, LocalDate.of(2023, 6, 1), "Pepo", "Condorito", "Some...", "Condorito");

        for (IProduct product : products) {
            System.out.print("Object belongs to: " + product.getClass().getSimpleName());
            System.out.print(" - Price: " + product.getPrice());
            System.out.print(" - Final price: " + product.getPriceSale());

            if (product instanceof IElectronic electronic) {
                System.out.print(" - Manufacturer: " + electronic.getManufacturer());

                if (product instanceof IPhone iPhone) {
                    System.out.print(" - Model: " + iPhone.getModel());
                    System.out.print(" - Color: " + iPhone.getColor());
                } else if (product instanceof TvLcd tv) {
                    System.out.print(" - Inches: " + tv.getInches());
                }
            }

            if (product instanceof IBook book) {
                System.out.print(" - Title: " + book.getTitle());
                System.out.print(" - Author: " + book.getAuthor());
                System.out.print(" - Publish date: " + book.getPublishDate());
                System.out.print(" - Publisher: " + book.getPublisher());

                if (product instanceof Comics comic) {
                    System.out.print(" - Character: " + comic.getCharacter());
                }
            }

            System.out.println();
        }
    }
}