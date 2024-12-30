package az.edu.turing.bookingappspring.model.request;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookingRequest {

    private final Integer bookingId;
    private final Integer flightId;
    private final Integer passengerId;

}
