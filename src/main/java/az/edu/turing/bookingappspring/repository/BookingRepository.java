package az.edu.turing.bookingappspring.repository;

import az.edu.turing.bookingappspring.entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<BookingEntity,Integer> {

}
