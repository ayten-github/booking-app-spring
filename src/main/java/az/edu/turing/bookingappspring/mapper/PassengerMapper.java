package az.edu.turing.bookingappspring.mapper;

import az.edu.turing.bookingappspring.dto.PassengerDto;
import az.edu.turing.bookingappspring.entity.PassengerEntity;
import org.springframework.stereotype.Service;

@Service
public class PassengerMapper {
    public PassengerDto toPassengerDto(PassengerEntity passengerEntity) {
        return new PassengerDto(
                passengerEntity.getId(),
                passengerEntity.getName(),
                passengerEntity.getSurname()
        );
    }
}
