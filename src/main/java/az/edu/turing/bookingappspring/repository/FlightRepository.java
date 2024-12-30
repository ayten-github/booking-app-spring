package az.edu.turing.bookingappspring.repository;

import az.edu.turing.bookingappspring.entity.FlightEntity;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<FlightEntity,Integer> {
    //GASHAXXXX
    List<FlightEntity> findByDepartureTimeBetween(LocalDateTime from, LocalDateTime to);
}
