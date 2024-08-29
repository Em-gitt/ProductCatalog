package org.erangel.productcatalog.product.model;

import java.time.LocalDate;

public class Book extends Product implements IBook {

    private LocalDate publishDate;
    private String author;
    private String title;
    private String publisher;

    public Book(int price, LocalDate publishDate, String author, String title, String publisher) {
        super(price);
        this.publishDate = publishDate;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
    }

    @Override
    public LocalDate getPublishDate() {
        return publishDate;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getPublisher() {
        return publisher;
    }

    @Override
    public double getPriceSale() {
        return price * 0.9;
    }
}