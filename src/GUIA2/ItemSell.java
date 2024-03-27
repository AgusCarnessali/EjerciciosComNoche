package GUIA2;

public class ItemSell {
    private Long id;
    private String name;
    private String description;
    private Double unitaryPrice;

    public ItemSell(Long id, String name, String description, Double unitaryPrice) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.unitaryPrice = unitaryPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getUnitaryPrice() {
        return unitaryPrice;
    }

    public void setUnitaryPrice(Double unitaryPrice) {
        this.unitaryPrice = unitaryPrice;
    }

    @Override
    public String toString() {
        return "ItemSell[id= " + id + ", name= " + name + ", description= " + description + ", unitaryPrice= " + unitaryPrice + "]";
    }


}
