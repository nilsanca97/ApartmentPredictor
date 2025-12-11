package com.example.apartment_predictor.repository;

import com.example.apartment_predictor.model.Apartment;
import org.springframework.data.repository.CrudRepository;

public interface ApartmentRepository extends CrudRepository<Apartment, String> {

}
