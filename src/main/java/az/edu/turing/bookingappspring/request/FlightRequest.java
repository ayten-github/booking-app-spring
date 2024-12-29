package az.edu.turing.bookingappspring.request;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class FlightRequest {

    private String destination;
    private String arrival;
    private int totalSeats;
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;

}


