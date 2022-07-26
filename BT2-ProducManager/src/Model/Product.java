package Model;

import java.io.Serializable;

public class Product implements Serializable {
    private String ID;
    private String name;
    private String brand;
    private int price;

    public Product() {
    }

    public Product(String ID, String name, String brand, int price) {
        this.ID = ID;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Model.Product[" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ']';
    }
}
