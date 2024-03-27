package GUIA2;

public class Book {
    private String title;
    private Double price;
    private Integer stock;
    private Author author;
    private Author otherAuthor;

    public Book(String title, Double price, Integer stock, Author author, Author otherAuthor) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.author = author;
        this.otherAuthor = otherAuthor;
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

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", author=" + author +
                ", otherAuthor=" + otherAuthor +
                '}';
    }

    public void printMessage() {
        System.out.println("El libro " + title + " de " + author.getName() + " y de " + otherAuthor.getName() + ". Se vende a " + price + " pesos.");

    }
}
