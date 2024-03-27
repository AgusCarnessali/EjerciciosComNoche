package GUIA2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class Invoice {
    private UUID id;
    private Double amount;
    private LocalDateTime date;
    private Client customer;
    private ArrayList<ItemSell> items;

    public Invoice(LocalDateTime date, Client customer, ArrayList<ItemSell> items) {
        this.id = UUID.randomUUID();
        this.amount = calculateAmount(items);
        this.date = date;
        this.customer = customer;
        this.items = items;
    }


    public UUID getId() {
        return id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Client getCustomer() {
        return customer;
    }

    public void setCustomer(Client customer) {
        this.customer = customer;
    }

    public ArrayList<ItemSell> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemSell> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Invoice{" + "id=" + id + ", amount=" + amount + ", date=" + date + ", customer=" + customer + '}';
    }

    private Double calculateAmount(ArrayList<ItemSell> items) {
        Double total = 0.0;
        for (ItemSell item : items) {
            total += item.getUnitaryPrice();
        }
        return total;
    }

    public void finalPrice() {
        Double price = calculateAmount(items);
        System.out.println("Final price is: " + (price * (1 - (customer.getPercentageOfDiscount() / 100.0))));
    }


}
