package az.edu.turing.bookingappspring.service;

import az.edu.turing.bookingappspring.dto.PassengerDto;
import az.edu.turing.bookingappspring.mapper.PassengerMapper;
import az.edu.turing.bookingappspring.repository.PassengerRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PassengerService {

    private final PassengerRepository passengerRepository;
    private final PassengerMapper passengerMapper;

    public PassengerDto getPassengerById(int id) {
        return passengerRepository.findById(id)
                .map(passengerMapper::toPassengerDto)
                .orElseThrow(()-> new EntityNotFoundException("Passenger not found"));
    }
    public List<PassengerDto> getAllPassengers() {
        return passengerRepository.findAll()
                .stream().map(passengerMapper::toPassengerDto)
                .toList();
    }
    public void deletePassengerById(int id) {
        passengerRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("Passenger not found"));
        passengerRepository.deleteById(id);
    }

}
