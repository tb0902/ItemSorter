package rocks.zipcode.io;

/**
 * @author leon on 30/01/2019.
 */
public class Item {
    String name;
    Double price;
    Long id;

    public Item() {
    name = "";
    price = 0.01;
    id = 0L;

    }

    public Item(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
