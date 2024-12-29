package az.edu.turing.bookingappspring.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Objects;
@Getter
@Setter
public class BookingDto {
    private int bookingId;
    private String fullName;
    private String departureCity;
    private String arrivalCity;
    private LocalDateTime time;

    public BookingDto(int bookingId, String fullName, String departureCity, String arrivalCity, LocalDateTime time) {
        this.bookingId = bookingId;
        this.fullName = fullName;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.time = time;
    }

    @Override
    public String toString() {
        return "BookingDto{" +
                "bookingId=" + bookingId +
                ", fullName='" + fullName + '\'' +
                ", departureCity='" + departureCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                ", time=" + time +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingDto that = (BookingDto) o;
        return bookingId == that.bookingId && Objects.equals(fullName, that.fullName) && Objects.equals(departureCity,
                that.departureCity) && Objects.equals(arrivalCity, that.arrivalCity) && Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, fullName, departureCity, arrivalCity, time);
    }
}
