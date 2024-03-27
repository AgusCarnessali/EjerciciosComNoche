package GUIA2;

import java.util.UUID;

public class Client {
    private UUID id;
    private String name;
    private String email;
    private Double percentageOfDiscount;

    public Client(String name, String email, Double percentageOfDiscount) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.percentageOfDiscount = percentageOfDiscount;
    }

    public UUID getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public Double getPercentageOfDiscount() {
        return percentageOfDiscount;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPercentageOfDiscount(Double percentageOfDiscount) {
        this.percentageOfDiscount = percentageOfDiscount;
    }
    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", percentageOfDiscount=" + percentageOfDiscount +
                '}';
    }

}
