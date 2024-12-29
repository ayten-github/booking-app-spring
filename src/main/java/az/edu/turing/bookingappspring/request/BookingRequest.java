package az.edu.turing.bookingappspring.request;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class BookingRequest {

    private final Integer bookingId;
    private final Integer flightId;
    private final Integer passengerId;

}
