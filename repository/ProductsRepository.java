package com.flight.flightbooker.repository;

import com.flight.flightbooker.model.Products;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends CrudRepository<Products, Long> {
}
