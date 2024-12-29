package az.edu.turing.bookingappspring.service;

import az.edu.turing.bookingappspring.dto.BookingDto;
import az.edu.turing.bookingappspring.entity.BookingEntity;
import az.edu.turing.bookingappspring.mapper.BookingMapper;
import az.edu.turing.bookingappspring.repository.BookingRepository;
import az.edu.turing.bookingappspring.request.BookingRequest;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class BookingService {
    private final BookingRepository bookingRepository;
    private final BookingMapper bookingMapper;

    public BookingDto createBooking(BookingRequest bookingRequest) {
        BookingEntity bookingEntity=new BookingEntity();
        bookingEntity.setId(bookingRequest.getBookingId());
        bookingEntity.setFlight_id(bookingRequest.getFlightId());
        bookingEntity.setPassenger_id(bookingRequest.getPassengerId());
        bookingEntity.setIsActive(true);
        BookingEntity bookingEntity1=bookingRepository.save(bookingEntity);
        return bookingMapper.toBookingDto(bookingEntity1);
    }

    public BookingDto getById(int id) {
        return bookingRepository.findById(id)
                .map(bookingMapper::toBookingDto)
                .orElseThrow(()->new EntityNotFoundException("Booking not found"));
    }

    public void deleteBooking(int bookingId) {
        bookingRepository.findById(bookingId).
                orElseThrow(() -> new EntityNotFoundException("Booking not found with id"));
        bookingRepository.deleteById(bookingId);
    }

    public Collection<BookingDto> getAllBookings() {
        return bookingRepository.findAll()
                .stream().map(bookingMapper::toBookingDto)
                .toList();
    }
    public BookingDto updateBooking(int id, BookingRequest request) {
        BookingEntity booking = bookingRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Booking not found with id " + id));

        booking.setFlight_id(request.getFlightId());
        booking.setPassenger_id(request.getPassengerId());

        BookingEntity updatedBooking = bookingRepository.save(booking);

        return bookingMapper.toBookingDto(updatedBooking);
    }
}
