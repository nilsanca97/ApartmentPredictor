package com.example.apartment_predictor;

import com.example.apartment_predictor.model.Apartment;
import com.example.apartment_predictor.repository.ApartmentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApartmentTests {

    @Autowired
    private ApartmentRepository apartmentRepository;

    @Test
    void createApartments() {
        Apartment apartment1= new Apartment();
        //apartment.setId(APT-001);
        apartment1.setPrice(150000L);
        apartment1.setArea(80);
        apartment1.setBedrooms(3);
        apartment1.setBathrooms(1);
        apartment1.setParking(1);
        apartment1.setFurnishingstatus("Yes");
        apartmentRepository.save(apartment1);

        System.out.println(apartment1);

        Apartment apartment2= new Apartment();
        //apartment.setId(APT-001);
        apartment2.setPrice(70000L);
        apartment2.setArea(40);
        apartment2.setBedrooms(2);
        apartment2.setBathrooms(1);
        apartment2.setParking(0);
        apartment2.setFurnishingstatus("No");
        apartmentRepository.save(apartment2);

        System.out.println(apartment2);

    }

}
