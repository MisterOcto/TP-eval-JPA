package PetShop;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class PetStore {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "MANAGER_NAME")
    private String managerName;

//    Non fonctionnel
//    @ManyToMany()
//    @JoinTable(name = "petstore_product")
//    private List<Product> products;
    @OneToOne
    private Address address;
    @OneToMany(mappedBy = "petStore")
    private List<Animal> animals;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public PetStore(){

    }
}
