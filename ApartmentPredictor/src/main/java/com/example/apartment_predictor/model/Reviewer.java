package com.example.apartment_predictor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity(name="Reviewer")
@Table(name= "Reviewer_Person_Table")
public class Reviewer extends Person {

    private boolean isBusiness;
    private String xAccount;
    private String webURL;
    private int qtyReviews;

    //private List<Review> reviews;

    //empty Constructor
    public Reviewer() {}

    // Constructor with all fields (including person attributes which inherence to reviewer class).
    public Reviewer(String fullName, LocalDate birthDate, String email, String password, boolean isActive, boolean isBusiness, String xAccount, String webURL, int qtyReviews) {
        super(fullName, birthDate, email, password, isActive);
        this.isBusiness = isBusiness;
        this.xAccount = xAccount;
        this.webURL = webURL;
        this.qtyReviews = qtyReviews;
    }
    // Getters & setters
    public boolean isBusiness() {
        return isBusiness;
    }

    public void setisBusiness(boolean business) {
        isBusiness = business;
    }

    public String getxAccount() {
        return xAccount;
    }

    public void setxAccount(String xAccount) {
        this.xAccount = xAccount;
    }

    public String getWebURL() {
        return webURL;
    }

    public void setWebURL(String webURL) {
        this.webURL = webURL;
    }

    public int getQtyReviews() {
        return qtyReviews;
    }

    public void setQtyReviews(int qtyReviews) {
        this.qtyReviews = qtyReviews;
    }

    // toString method of Reviewer model class
    @Override
    public String toString() {
        return "Reviewer{" +
                "isBusiness=" + isBusiness +
                ", xAccount='" + xAccount + '\'' +
                ", webURL='" + webURL + '\'' +
                ", qtyReviews=" + qtyReviews +
                "} " + super.toString();
    }
}
