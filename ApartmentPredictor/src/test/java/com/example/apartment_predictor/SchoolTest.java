package com.example.apartment_predictor;

import com.example.apartment_predictor.model.School;
import com.example.apartment_predictor.repository.SchoolRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SchoolTest {

    @Autowired
    private SchoolRepository schoolRepository;

    @Test
    void createSchools() {
        School school1 = new School();
        //school1.setId("SCH-001");
        school1.setLocation("C/ Angli, 20");
        school1.setRating(4);
        school1.setName("OAK School");
        school1.setType("Primary, secondary & bachiller school");
        school1.setPublic(false);
        schoolRepository.save(school1);

        System.out.println(school1);

        School school2 = new School();
        //school2.setId("SCH-002");
        school2.setLocation("C/ Aguilar, 150");
        school2.setRating(5);
        school2.setName("Pit-Roig School");
        school2.setType("Primary school");
        school2.setPublic(true);
        schoolRepository.save(school2);

        System.out.println(school2);
    }
}
