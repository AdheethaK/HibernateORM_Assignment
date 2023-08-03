package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    private String ISBN;
    private String authno;
    private String title;
    private String edition;
    private String category;
    private Double price;

    public Book() {
    }

    public Book(String ISBN, String authno, String title, String edition, String category, Double price) {
        this.ISBN = ISBN;
        this.authno = authno;
        this.title = title;
        this.edition = edition;
        this.category = category;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthno() {
        return authno;
    }

    public void setAuthno(String authno) {
        this.authno = authno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", authno='" + authno + '\'' +
                ", title='" + title + '\'' +
                ", edition='" + edition + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
