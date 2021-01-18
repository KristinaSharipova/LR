package com.flight.flightbooker.repository;

import com.flight.flightbooker.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  Optional<User> findByUsernameAndPassword(String username, String password);
}
