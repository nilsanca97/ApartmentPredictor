package com.example.apartment_predictor.service;

import com.example.apartment_predictor.model.Apartment;
import com.example.apartment_predictor.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApartmentService {

    @Autowired
    ApartmentRepository apartmentRepository;

    // implement CRUD operations: read
    public Iterable<Apartment> findAll() {

        return apartmentRepository.findAll();
    }


    public Apartment createApartment(Apartment apartment){
        return apartmentRepository.save(apartment);
    }

    /* public Apartment updateApartment(String id, Apartment apartment) {
        Apartment ap = apartmentRepository.findById(id).orElse(null);

        if (ap != null) {
            ap.setBedrooms(apartment.getBedrooms());
            ap.setArea(apartment.getArea());
            return apartmentRepository.save(ap);
        }
        return null;
    }*/
    public Apartment updateApartment (String id, Apartment apartment){

        Optional<Apartment> apartmentOptional = apartmentRepository.findById(id);
        if (apartmentOptional.isPresent()) {
            Apartment ap = apartmentOptional.get();
            ap.setPrice(apartment.getPrice());
            ap.setBedrooms(apartment.getBedrooms());
            ap.setArea(apartment.getArea());
            return apartmentRepository.save(ap);
        }
        return null;
    }

    public void deleteApartment (Apartment apartment){
        apartmentRepository.delete(apartment);
    }
    public void deleteById (String id) {
        apartmentRepository.deleteById(id);
    }

    public Apartment findApartmentById (String id){

        Optional<Apartment> found = apartmentRepository.findById(id);
        if ( found.isPresent()) return found.get() ;
        else return null;

    }

}
