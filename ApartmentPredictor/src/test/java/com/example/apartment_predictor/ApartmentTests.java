package com.example.apartment_predictor;

import com.example.apartment_predictor.model.Apartment;
import com.example.apartment_predictor.repository.ApartmentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApartmentTests {

    @Autowired
    ApartmentRepository apartmentRepository;

    @Test
    void testCreateApartment() {
        // Create apartment objects based on your sample data
        Apartment apartment1 = new Apartment(
                13300000L,    // price
                7420,         // area
                4,            // bedrooms
                2,            // bathrooms
                3,            // stories
                "yes",        // mainroad
                "no",         // guestroom
                "no",         // basement
                "no",         // hotwater
                "yes",        // airconditioning
                2,            // parking
                "yes",        // prefarea
                "furnished"   // furnishingstatus
        );

        Apartment apartment2 = new Apartment(8500000L, 5200, 3, 2, 2, "yes", "yes", "no", "yes", "yes", 1, "no", "semi-furnished");

        Apartment apartment3 = new Apartment();
        apartment3.setPrice(150000L);
        apartment3.setPrice(200000L);
        apartment3.setArea(50);
        apartment3.setBedrooms(3);
        apartment3.setAirconditioning("yes");

        Apartment apartment4 = new Apartment();
        apartment4.setPrice(300000L);
        apartment4.setArea(70);
        apartment4.setBedrooms(5);
        apartment4.setAirconditioning("yes");
        apartment4.setBathrooms(2);

        // Display the created apartments
        System.out.println("\n=== Created Apartments ===");
        System.out.println("Apartment 1: " + apartment1);
        System.out.println("\nApartment 2: " + apartment2);
        System.out.println("\nApartment 3: " + apartment3);

        apartmentRepository.save(apartment1);
        apartmentRepository.save(apartment2);
        apartmentRepository.save(apartment3);
        apartmentRepository.save(apartment4);

        int index = 0;
        System.out.println("\n=== Apartments in the Database ===");
        for (Apartment apartment : apartmentRepository.findAll()){
            index++;
            System.out.println("#" + index);
            System.out.println(apartment);
        }

        //apartmentRepository.findAll().forEach(System.out::println);

    }

}
