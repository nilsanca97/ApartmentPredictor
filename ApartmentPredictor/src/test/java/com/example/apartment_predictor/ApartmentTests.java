package com.example.apartment_predictor;

import com.example.apartment_predictor.model.Apartment;
import com.example.apartment_predictor.model.School;
import com.example.apartment_predictor.repository.ApartmentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    void assignSchoolsToApartment() {
        School school1 = new School();
        school1.setName("Escola Guinardó");
        school1.setId("1");

        School school2 = new School();
        school2.setId("2");
        school2.setName("Escola del Mar");

        School school3 = new School();
        school3.setId("3");
        school3.setName("OAK School");

        List<School> schools = new ArrayList<>();
        schools.add(school1);
        schools.add(school2);
        schools.add(school3);

        Apartment apartment1 = new Apartment();
        //apartment.setId(APT-001);
        apartment1.setPrice(370000L);
        apartment1.setArea(120);
        apartment1.setBedrooms(5);
        apartment1.setBathrooms(2);
        apartment1.setParking(2);
        apartment1.setFurnishingstatus("No");
        apartment1.addSchool(school1);
        apartment1.addSchool(school2);
        apartmentRepository.save(apartment1);

        System.out.println(apartment1);

        Apartment apartment2 = new Apartment();
        //apartment.setId(APT-002);
        apartment2.setPrice(59865L);
        apartment2.addSchools(schools);
        apartmentRepository.save(apartment2);
    }

    @Test
    void createApartmentWithSchools() {
        // create Apartment
        Apartment apartment1 = new Apartment();
        apartment1.setPrice(87643L);
        apartment1.setMainroad("C/ Aragó 123");

        // create Schools
        School school1 = new School();
        school1.setName("Institut Francisco Goy");
        school1.setPublic(true);
        school1.setRating(2);

        School school2= new School();
        school2.setName("La Salle Horta");
        school2.setPublic(false);
        school2.setRating(4);

        // Establish the unidirectional relationship:
        // (only visibility schools from apartment). But not apartment from School class
        // school1.setApartment(apartment1) // School --> Apartment
        // school2.setApartment(apartment1) // School --> Apartment
        apartment1.getSchools().add(school1); // Apartment --> School
        apartment1.getSchools().add(school2); // Apartment --> School

        // Save (cascade will save schools automatically
        apartmentRepository.save(apartment1);
    }

}
