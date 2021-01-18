package com.flight.flightbooker.repository;

import com.flight.flightbooker.model.BookedFlight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookedFlightRepository extends CrudRepository<BookedFlight, Long> {
  List<BookedFlight> findByUserId(Long userId);
}
