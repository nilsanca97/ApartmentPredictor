package com.example.apartment_predictor;

import java.time.LocalDate;

public class Review {

    //1. ATRIBUTES (FIELDS)
    private String id;
    private String reviewText;
    private int rating;
    private LocalDate reviewDate;
    private String apartmentId;
    private String reviewerId;

    //2. CONTRUCTOR
    // 2.1 default contructor
    public Review() {}

    // 2.2 Contructor with all fields
    public Review(String id, int rating, String apartmendId, String reviewerId) {

        this.id= id;
        this.rating = rating;
        this.apartmentId = apartmendId;
        this.reviewerId = reviewerId;
    }

    // 3. Getters & setters
    public String getId() {
        return id;
    }

    /*public void setId(String id) {
        this.id = id;
    }*/

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public LocalDate getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(String apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(String reviewerId) {
        this.reviewerId = reviewerId;
    }

    // 4. method toString
    @Override
    public String toString() {
        return "Review { " +
                "id: " + id +
                ", reviewText: " + reviewText +
                ", rating: " + rating +
                ", reviewDate: " + reviewDate +
                ", apartmentId: " + apartmentId +
                ", reviewerId: " + reviewerId +
                "}" ;
    }
}
