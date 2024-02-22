package PetShop;
import jakarta.persistence.*;

@Entity
public class Fish extends Animal {
    @Column(name = "LIVING_ENV")
    private FishLivEnv livingEnv;

    public Fish() {

    }

    public enum FishLivEnv {
        FRESH_WATER,
        SEA_WATER
    }
}

