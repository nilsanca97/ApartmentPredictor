package com.example.apartment_predictor;

import com.example.apartment_predictor.model.Apartment;
import com.example.apartment_predictor.model.Review;
import com.example.apartment_predictor.repository.ReviewRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class ReviewTest {

    @Autowired
    ReviewRepository reviewRepository;

    @Test
    void testReviewInsert() {
        // Create review objects based on your sample data
        Review review1 = new Review(
                "Comfortable stay in a great location",  // title
                "he apartment is cozy, clean, and has everything you need for a pleasant stay. The location is excellent and the host is very attentive.", // content
                8 // rating
        );

        Review review2 = new Review(
                "Perfect place to relax", // title
                "A very comfortable and well-equipped apartment. Quiet area and easy check-in, ideal for a short or long stay.", // content
                5, //rating
                LocalDate.of(2024, 8, 20)
        );
        Review review3 = new Review(
                "Great value and lovely host", // title
                "The apartment was spotless and exactly as described. Communication with the host was smooth and friendly throughout the stay.", // content
                5, //rating
                LocalDate.of(2025, 12, 16)
        );

        // Display the created apartments
        System.out.println("\n=== Created Reviews ===");
        System.out.println("Review 1: " + review1);
        System.out.println("Review 2: " + review2);
        System.out.println("Review 3: " + review3);

        reviewRepository.save(review1);
        reviewRepository.save(review2);
        reviewRepository.save(review3);

        int index = 0;
        System.out.println("\n=== Reviews in the Database ===");
        for (Review review : reviewRepository.findAll()){
            index++;
            System.out.println("#" + index);
            System.out.println(review);
        }
    }
}
