package az.edu.turing.bookingappspring.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class BookingEntity {
    @Id
    private Integer id;
    private Integer flight_id;
    private Integer passenger_id;
    private  Boolean isActive;

}
