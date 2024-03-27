package GUIA2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MainGuia2 {
    public static void main(String[] args) {
        Author author = new Author("Joshua","Block","joshua@gmail.com",'M');
        Author author2 = new Author("John","Doe","john@gmail.com",'M');
        System.out.println(author);

        Book book = new Book("Effective Java",450d,150,author,author2);
        System.out.println(book);

        book.setPrice(500d);
        book.setStock(book.getStock()+50);

        System.out.println(book.getAuthor().getName());
        System.out.println(book.getAuthor().getSurname());
        System.out.println(book.getAuthor().getEmail());
        System.out.println(book.getAuthor().getGender());

        book.printMessage();


        Client client = new Client("Juan","Juan@gmail.com",50d);
        System.out.println(client);


        ArrayList<ItemSell> items = new ArrayList<>();
        ItemSell itemSell = new ItemSell(1l,"Bottle","big bottle",300d);
        ItemSell itemSell2 = new ItemSell(2l,"Phone","iPhone",500d);
        ItemSell itemSell3 = new ItemSell(3l,"Notebook","DELL notebook",4000d);
        items.add(itemSell);
        items.add(itemSell2);
        items.add(itemSell3);

        Invoice invoice = new Invoice(LocalDateTime.now(),client,items);
        System.out.println(invoice);
        System.out.println(invoice.getAmount());
        invoice.finalPrice();
    }
}
