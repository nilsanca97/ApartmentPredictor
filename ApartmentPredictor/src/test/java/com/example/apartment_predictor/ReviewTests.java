package com.example.apartment_predictor;

import com.example.apartment_predictor.model.Reviewer;
import com.example.apartment_predictor.repository.ReviewerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class ReviewTests {

    @Autowired
    private ReviewerRepository reviewerRepository;

    @Test
    void createReviewers() {
        Reviewer reviewer1 = new Reviewer("Pepe Lopez Medina", LocalDate.of(1997, 12, 10), "pepelopez@gmail.com", "1234", true, true, "876439870", "pisosbaratosLopez.com", 4);
        reviewerRepository.save(reviewer1);

        Reviewer reviewer2 = new Reviewer();
        reviewer2.setFullName("Maria Carrasco Gomez");
        reviewer2.setBirthDate(LocalDate.of(1965, 4, 16));
        reviewer2.setEmail("maria.carrasco@gmail.com");
        reviewer2.setPassword("1234");
        reviewer2.setActive(true);
        reviewer2.setisBusiness(true);
        reviewer2.setxAccount("98243332987");
        reviewer2.setWebURL("imobiliariaMariaCarrasco.com");
        reviewer2.setQtyReviews(7);
        reviewerRepository.save(reviewer2);
    }
}
