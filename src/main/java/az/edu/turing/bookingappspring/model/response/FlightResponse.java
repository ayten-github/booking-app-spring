package az.edu.turing.bookingappspring.model.response;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class FlightResponse {

    private Integer flightID;
    private String destination;
    private String arrival;
    private LocalDateTime time;
    private Integer availableSeats;

}