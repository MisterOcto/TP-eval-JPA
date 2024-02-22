package PetShop;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@DiscriminatorColumn(name="TYPE")
public class Animal {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Column(name = "BIRTH")
    private LocalDateTime birth;
    @Column(name = "COLOR")
    private String color;
    @ManyToOne()
    private PetStore petStore;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getBirth() {
        return birth;
    }

    public void setBirth(LocalDateTime birth) {
        this.birth = birth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animal(){

    }
}
