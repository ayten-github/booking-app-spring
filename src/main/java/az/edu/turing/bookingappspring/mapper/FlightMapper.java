package az.edu.turing.bookingappspring.mapper;

import az.edu.turing.bookingappspring.dto.FlightDto;
import az.edu.turing.bookingappspring.entity.FlightEntity;
import org.springframework.stereotype.Service;

@Service
public class FlightMapper {
    public FlightDto toFlightDto(FlightEntity flightEntity) {
        return new FlightDto(
                flightEntity.getId(),
                flightEntity.getDepartureCity(),
                flightEntity.getArrivalCity(),
                flightEntity.getDepartureTime(),
                flightEntity.getFreeSeats()
        );
    }
}
