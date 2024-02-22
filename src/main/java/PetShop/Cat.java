package PetShop;
import jakarta.persistence.*;

@Entity
public class Cat extends Animal {
    @Column(name = "CHIP_ID")
    private String chipId;

    public Cat() {

    }
}
