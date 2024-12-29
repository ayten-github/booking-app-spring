package az.edu.turing.bookingappspring.response;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class BookingResponse {
    private int bookingId;
    private String fullName;
    private String departureCity;
    private String arrivalCity;
    private LocalDateTime time;

}