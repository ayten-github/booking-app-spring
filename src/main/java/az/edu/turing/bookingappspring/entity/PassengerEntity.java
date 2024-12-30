package az.edu.turing.bookingappspring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;


@Entity
@Data
public class PassengerEntity {

    @Id
    private  Integer id;
    private String name;
    private String surname;
}
