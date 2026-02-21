package com.example.apartment_predictor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity(name="Reviewer")
@Table(name= "Reviewer_Person_Table")
public class Reviewer extends Person {

    private String reviewerType;
    private int experienceYears;
    private double averageRating;

    //private List<Review> reviews;

    //empty Constructor
    public Reviewer() {}

    // Constructor with all fields (including person attributes which inherence to reviewer class).
    public Reviewer(String fullName, LocalDate birthDate, String email, String password, boolean isActive, String ReviewerType, int experienceYears, double averageRating) {
        super(fullName, birthDate, email, password, isActive);
        this.reviewerType = reviewerType;
        this.experienceYears = experienceYears;
        this.averageRating = averageRating;
    }

    // Getters & setters
    public String getReviewerType() {
        return reviewerType;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public double getAverageRating() {
        return averageRating;
    }

    // toString method of Reviewer model class

    @Override
    public String toString() {
        return "Reviewer{" +
                "reviewerType='" + reviewerType + '\'' +
                ", experienceYears=" + experienceYears +
                ", averageRating=" + averageRating +
                "} " + super.toString();
    }
}
