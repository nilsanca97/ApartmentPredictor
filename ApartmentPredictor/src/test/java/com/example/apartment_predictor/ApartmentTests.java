package com.example.apartment_predictor;

import com.example.apartment_predictor.model.Apartment;
import com.example.apartment_predictor.model.Review;
import com.example.apartment_predictor.repository.ApartmentRepository;
import com.example.apartment_predictor.repository.ReviewRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ApartmentTests {

    @Autowired
    ApartmentRepository apartmentRepository;

    @Autowired
    ReviewRepository reviewRepository;

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
        System.out.println("\nApartment 4: " + apartment4);

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
    @Test
    void testInsertReviewIntoApartment(){
        Apartment apartment1 = new Apartment();
        apartment1.setPrice(300000L);
        // Display the created apartment1
        System.out.println("\n=== Created Apartment1 ===");
        System.out.println("Apartment 1: " + apartment1);

        apartmentRepository.save(apartment1);

        Review review1 = new Review();
        review1.setTitle("Fantastic house for enjoy a holidays");
        review1.setApartment(apartment1);

        Review review2 = new Review();
        review2.setTitle("Lovely house in the middle of Barcelona town");
        review2.setApartment(apartment1);

        Review review3 = new Review();
        review3.setTitle("Great value and lovely host");
        review3.setApartment(apartment1);

        // Display the created reviews
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

    @Test //para ver (comprobar) las reviews de un apartamento desde JPA (backend)
    @Transactional // because I have LAZY in @OneToMany (from apartment class) in attribute List<Review> reviews
    void testInsertAndReadReviewIntoApartment() {

        //1. Create an apartment
        Apartment apartment1 = new Apartment();
        apartment1.setPrice(300000L);
        // Display the created apartment1
        System.out.println("\n=== Created Apartment1 ===");
        System.out.println("Apartment 1: " + apartment1);

        apartmentRepository.save(apartment1);

        //2.1 Create 3 reviews
        Review review1 = new Review();
        review1.setTitle("Fantastic house for enjoy a holidays");
        review1.setApartment(apartment1);

        Review review2 = new Review();
        review2.setTitle("Lovely house in the middle of Barcelona town");
        review2.setApartment(apartment1);

        Review review3 = new Review();
        review3.setTitle("Great value and lovely host");
        review3.setApartment(apartment1);

        //2.2 Display the created reviews
        System.out.println("\n=== Created Reviews ===");
        System.out.println("Review 1: " + review1);
        System.out.println("Review 2: " + review2);
        System.out.println("Review 3: " + review3);

        //2.3 save 3 reviews into reviewRepository
        reviewRepository.save(review1);
        reviewRepository.save(review2);
        reviewRepository.save(review3);

        apartment1.getReviews().add(review1);
        apartment1.getReviews().add(review2);
        apartment1.getReviews().add(review3);

        // !!! SOLO guardas el apartment
        apartmentRepository.save(apartment1);

        // 3. Recuperar el apartamento desde BD
        Apartment apartmentFromDb = apartmentRepository.findById(apartment1.getId()).orElseThrow();

        // 4 Acceder a las reviews de un apartamento (para ver las reviews from JPA- backend)
        List<Review> reviews = apartmentFromDb.getReviews();

        //5. Mostrar resultados
        System.out.println("\n=== Reviews of Apartment ID " + apartmentFromDb.getId() + " ===");
        reviews.forEach(System.out::println);

        //6. Assertions (lo importante del test)
        //assertEquals(3, reviews.size());
    }

}
