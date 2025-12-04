package com.example.apartment_predictor;

public class Reviewer extends Person {

    //1. ATRIBUTES (FIELDS)

    private String reviewerType;
    private int experienceYears;
    private double averageRating;

    //2. CONSTRUCTOR
    //2.1 default constructor
    public Reviewer() {}

    //2.2 Constructor with all fields (person fields and reviewer fields)
    public Reviewer(String id, String name, String email, int age, String reviewerType, int experienceYears, double averageRating) {
        super(id, name, email, age);
        this.reviewerType = reviewerType;
        this.experienceYears = experienceYears;
        this.averageRating = averageRating;
    }

    // 3. Getters & setters
    public String getReviewerType() {
        return reviewerType;
    }

    public void setReviewerType(String reviewerType) {
        this.reviewerType = reviewerType;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    @Override
    public String toString() {
        return "Reviewer{" +
                super.toString() +
                "reviewerType='" + reviewerType + '\'' +
                ", experienceYears=" + experienceYears +
                ", averageRating=" + averageRating +
                "} ";
    }
}
