package az.edu.turing.bookingappspring.repository;

import az.edu.turing.bookingappspring.entity.FlightEntity;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface FlightRepository extends JpaRepository<FlightEntity,Integer> {
    @Query("SELECT f FROM Flight f WHERE f.time >= :now AND f.time < :endTime")
    List<FlightEntity> findFlightsWithinTimePeriod(@Param("now") LocalDateTime now,
                                                   @Param("endTime") LocalDateTime endTime);
}
