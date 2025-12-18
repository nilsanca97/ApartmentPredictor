package com.example.apartment_predictor;

import com.example.apartment_predictor.model.Apartment;
import com.example.apartment_predictor.model.Review;
import com.example.apartment_predictor.repository.ApartmentRepository;
import com.example.apartment_predictor.repository.ReviewRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class ReviewTest {

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    ApartmentRepository apartmentRepository;

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
//        Review review4 = new Review();
//        review4.setTitle("Fantastic house for enjoy a holidays");
//        review4.setApartment(apartment1);

//        Review review5 = new Review();
//        review5.setTitle("Perfect and suitable family flat in Barcelona");
//        review5.setApartment(apartmentRepository.);

        // Display the created apartments
        System.out.println("\n=== Created Reviews ===");
        System.out.println("Review 1: " + review1);
        System.out.println("Review 2: " + review2);
        System.out.println("Review 3: " + review3);
        //System.out.println("Review 4 with apartment: " + review4);

        reviewRepository.save(review1);
        reviewRepository.save(review2);
        reviewRepository.save(review3);
        //reviewRepository.save(review4);
        int index = 0;
        System.out.println("\n=== Reviews in the Database ===");
        for (Review review : reviewRepository.findAll()){
            index++;
            System.out.println("#" + index);
            System.out.println(review);
        }
    }

    @Test
    void testApartmentInsertIntoReview() {

        Apartment apartment3 = new Apartment();
        apartment3.setPrice(200000L);
        apartment3.setArea(50);
        apartment3.setBedrooms(3);
        apartment3.setAirconditioning("yes");
        //
        Apartment apartment4 = new Apartment();
        apartmentRepository.save(apartment3);
        apartmentRepository.save(apartment4);
        System.out.println("Apartment saved: " + apartment3);
        System.out.println("Apartment saved: " + apartment4);

        Review review1 = new Review();
        review1.setContent("This apartment exceeded my expectations. The location is perfect and the amenities are top-notch. Highly recommended for anyone looking for a comfortable stay.");
        review1.setRating(5);
        review1.setTitle("Nice Apartment in Fifth Avenue");
        review1.setReviewDate(LocalDate.now());
        review1.setApartment(apartment3);
        review1.setApartment(apartment4);

        reviewRepository.save(review1);
    }
}
