package az.edu.turing.bookingappspring.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;
@Entity
@Data
public class FlightEntity {
    @Id
    private Integer id;
    private LocalDateTime departureTime;
    private String departureCity;
    private String arrivalCity;
    private Integer totalSeats;
    private Integer freeSeats;
}
