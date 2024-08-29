package org.erangel.productcatalog.product;

import org.erangel.productcatalog.product.model.Book;

import java.time.LocalDate;

public class Comics extends Book {
    private String Character;


    public Comics(int price, LocalDate publishDate, String author, String title, String publisher, String Character) {
        super(price, publishDate, author, title, publisher);
        this.Character = Character;
    }

    public String getCharacter() {
        return Character;
    }
}
