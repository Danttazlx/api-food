package projetoJava.ProjetoJAVA.food;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "Food")
public class FoodModel implements Serializable {

    public FoodModel() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private LocalDate expientionDate;
    private Integer quantity;


}
