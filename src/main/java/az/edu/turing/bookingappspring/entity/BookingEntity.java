package az.edu.turing.bookingappspring.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Data
public class BookingEntity {
    @Id
    @SequenceGenerator(name = "booking_seq", allocationSize = 1)
    @GeneratedValue(generator = "booking_seq")
    private Integer id;
    private Integer flight_id;
    private Integer passenger_id;
    private  Boolean isActive;

}
