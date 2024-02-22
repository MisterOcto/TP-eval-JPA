package PetShop;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Column(name = "CODE")
    private String code;
    @Column(name = "LABEL")
    private String name;
    @Column(name = "TYPE")
    private ProdType type;
    @Column(name = "PRICE")
    private double price;
    //    Non fonctionnel
//    @ManyToMany(mappedBy = "PetStore")
//    private List<PetStore> petStores;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(){
    }

    public enum ProdType {
        FOOD,
        ACCESSORY,
        CLEANING
    }
}
