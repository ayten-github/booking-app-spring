package az.edu.turing.bookingappspring.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PassengerDto {
    private int passengerId;
    private String firstName;
    private String secondName;

    public PassengerDto(String name, String surname) {
        this.firstName = name;
        this.secondName = surname;
    }

    public PassengerDto(int passengerId, String firstName, String secondName) {
        this.passengerId = passengerId;
        this.firstName = firstName;
        this.secondName = secondName;
    }


    @Override
    public String toString() {
        return "PassengerDto{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
