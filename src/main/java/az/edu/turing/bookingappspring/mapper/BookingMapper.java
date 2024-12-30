package az.edu.turing.bookingappspring.mapper;

import az.edu.turing.bookingappspring.dto.BookingDto;
import az.edu.turing.bookingappspring.entity.BookingEntity;
import az.edu.turing.bookingappspring.entity.FlightEntity;
import az.edu.turing.bookingappspring.entity.PassengerEntity;
import az.edu.turing.bookingappspring.repository.FlightRepository;
import az.edu.turing.bookingappspring.repository.PassengerRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class BookingMapper {
    private final PassengerRepository passengerRepository;
    private final FlightRepository flightRepository;

    public BookingMapper(PassengerRepository passengerRepository, FlightRepository flightRepository) {
       this.passengerRepository = passengerRepository;
        this.flightRepository = flightRepository;
    }

    public BookingDto toBookingDto(BookingEntity booking) {
        FlightEntity flight = flightRepository.findById(booking.getFlight_id())
                .orElseThrow(() -> new EntityNotFoundException("Flight not found with ID: " + booking.getFlight_id()));
int passengerRepositoryId=passengerRepository.findById(booking.getPassenger_id()).map(PassengerEntity::getId).
        orElseThrow(()->new EntityNotFoundException("Passenger not found"));
        return new BookingDto(
                booking.getId(),
                passengerRepositoryId,
                flight.getDepartureCity(),
                flight.getArrivalCity(),
                flight.getDepartureTime()
        );
    }

}
