package GUIA2;

import java.util.List;

public class Book {
    private String title;
    private Double price;
    private Integer stock;
    private Author author;
    private Author otherAuthor;

    private Author[] testAttribute1;

    private List<Author> testAttribute2;

    public Book(String title, Double price, Integer stock, Author author, Author otherAuthor, Author[] authors1, List<Author> authors2) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.author = author;
        this.otherAuthor = otherAuthor;
        this.testAttribute1 = authors1;
        this.testAttribute2 = authors2;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getOtherAuthor() {
        return otherAuthor;
    }

    public void setOtherAuthor(Author otherAuthor) {
        this.otherAuthor = otherAuthor;
    }

    public Author[] getTestAttribute1() {
        return testAttribute1;
    }

    public void setTestAttribute1(Author[] testAttribute1) {
        this.testAttribute1 = testAttribute1;
    }

    public List<Author> getTestAttribute2() {
        return testAttribute2;
    }

    public void setTestAttribute2(List<Author> testAttribute2) {
        this.testAttribute2 = testAttribute2;
    }

    @Override
    public String toString() {

        String data = "Book{" +
                "title='" + title + "'" +
                ", price=" + price +
                ", stock=" + stock +
                ", author=" + author +
                ", otherAuthor=" + otherAuthor +
                ", testAttribute1=";

        for (int x = 0; x < testAttribute1.length; x++) {
            data += testAttribute1[x] + (x != (testAttribute1.length - 1) ? ", " : "");
        }

        data += ", testAttribute2=";

        for (int x = 0; x < testAttribute2.size(); x++) {
            data += testAttribute2.get(x) + (x != (testAttribute2.size() - 1) ? ", " : "");
        }

        data += "}";

        return data;
    }

    public void printMessage() {
        System.out.println("El libro " + title + " de " + author.getName() + " y de " + otherAuthor.getName() + ". Se vende a " + price + " pesos.");

    }
}
