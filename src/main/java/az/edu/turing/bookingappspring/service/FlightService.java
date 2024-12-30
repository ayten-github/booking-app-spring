package az.edu.turing.bookingappspring.service;

import az.edu.turing.bookingappspring.dto.FlightDto;
import az.edu.turing.bookingappspring.entity.FlightEntity;
import az.edu.turing.bookingappspring.mapper.FlightMapper;
import az.edu.turing.bookingappspring.repository.FlightRepository;
import az.edu.turing.bookingappspring.model.request.FlightRequest;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FlightService {

    private final FlightRepository flightRepository;
    private final FlightMapper flightMapper;

    public List<FlightDto> getFlightsForNextHours(int durationInHours) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime endTime = now.plusHours(durationInHours);  // dynamically set the end time

        return flightRepository.findByDepartureTimeBetween(now, endTime).stream()
                .map(flightMapper::toFlightDto)
                .toList();
    }

    public FlightDto getFlightById(int id) {
        return flightRepository.findById(id)
                .map(flightMapper::toFlightDto)
                .orElseThrow(() -> new EntityNotFoundException("Flight not found"));
    }

    public List<FlightDto> getAll() {
        return flightRepository.findAll().stream()
                .map(flightMapper::toFlightDto)
                .toList();
    }

    public void deleteFlightById(int id) {
        flightRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Flight not found"));
        flightRepository.deleteById(id);
    }

    public FlightDto createFlight(FlightRequest flightRequest) {
        FlightEntity flightEntity = new FlightEntity();
        LocalDateTime dateTime=LocalDateTime.of(flightRequest.getYear(),flightRequest.getMonth(),flightRequest.getDay(),
                flightRequest.getHour(),flightRequest.getMinute());
        flightEntity.setDepartureCity(flightRequest.getDestination());
        flightEntity.setArrivalCity(flightRequest.getArrival());
        flightEntity.setDepartureTime(dateTime);
        flightEntity.setTotalSeats(flightRequest.getTotalSeats());
        flightEntity.setFreeSeats(flightRequest.getTotalSeats());
        return flightMapper.toFlightDto(flightRepository.save(flightEntity));
    }
}