package az.edu.turing.bookingappspring.repository;
import az.edu.turing.bookingappspring.entity.PassengerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository  extends JpaRepository<PassengerEntity,Integer> {
}
