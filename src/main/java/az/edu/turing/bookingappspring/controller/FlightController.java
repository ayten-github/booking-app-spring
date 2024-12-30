package az.edu.turing.bookingappspring.controller;

import az.edu.turing.bookingappspring.dto.FlightDto;
import az.edu.turing.bookingappspring.model.request.FlightRequest;
import az.edu.turing.bookingappspring.service.FlightService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
@RequiredArgsConstructor
public class FlightController {

    private final FlightService flightService;

    @GetMapping("/next/{durationInHours}")
    public ResponseEntity<List<FlightDto>> getFlightsForNextHours(@PathVariable int durationInHours) {
        List<FlightDto> flights = flightService.getFlightsForNextHours(durationInHours);
        return new ResponseEntity<>(flights, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FlightDto> getFlightById(@PathVariable int id) {
        FlightDto flightDto = flightService.getFlightById(id);
        return new ResponseEntity<>(flightDto, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<FlightDto>> getAllFlights() {
        List<FlightDto> flights = flightService.getAll();
        return new ResponseEntity<>(flights, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<FlightDto> createFlight(@RequestBody FlightRequest flightRequest) {
        FlightDto flightDto = flightService.createFlight(flightRequest);
        return new ResponseEntity<>(flightDto, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFlightById(@PathVariable int id) {
        flightService.deleteFlightById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
