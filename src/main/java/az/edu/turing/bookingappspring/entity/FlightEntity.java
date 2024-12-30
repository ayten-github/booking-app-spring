package az.edu.turing.bookingappspring.entity;


import jakarta.persistence.Entity;
import java.time.LocalDateTime;
import jakarta.persistence.Id;
import lombok.Data;

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
