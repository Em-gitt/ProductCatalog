package org.erangel.productcatalog.product.model;

import java.time.LocalDate;

public interface IBook {
    LocalDate getPublishDate();
    String getAuthor();
    String getTitle();
    String getPublisher();
}