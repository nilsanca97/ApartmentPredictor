package com.example.apartment_predictor;

import com.example.apartment_predictor.model.Review;
import com.example.apartment_predictor.repository.ReviewRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
                5 //rating
        );
    }
}
