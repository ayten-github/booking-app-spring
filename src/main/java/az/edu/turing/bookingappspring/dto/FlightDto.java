package az.edu.turing.bookingappspring.dto;

import java.time.LocalDateTime;
import java.util.Objects;

public class FlightDto {
    private Integer flightID;
    private String destination;
    private String arrival;
    private LocalDateTime time;
    private Integer availableSeats;

    public FlightDto(Integer flightID, String destination, String arrival, LocalDateTime time, Integer availableSeats) {
        this.flightID = flightID;
        this.destination = destination;
        this.arrival = arrival;
        this.time = time;
        this.availableSeats = availableSeats;
    }

    public Integer getFlightID() {
        return flightID;
    }

    public void setFlightID(Integer flightID) {
        this.flightID = flightID;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    @Override
    public String toString() {
        return "FlightDto{" +
                "flightID=" + flightID +
                ", destination='" + destination + '\'' +
                ", arrival='" + arrival + '\'' +
                ", time=" + time +
                ", availableSeats=" + availableSeats +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightDto flightDto = (FlightDto) o;
        return Objects.equals(flightID, flightDto.flightID) && Objects.equals(destination, flightDto.destination) &&
                Objects.equals(arrival, flightDto.arrival) && Objects.equals(time, flightDto.time) &&
                Objects.equals(availableSeats, flightDto.availableSeats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightID, destination, arrival, time, availableSeats);
    }
}

