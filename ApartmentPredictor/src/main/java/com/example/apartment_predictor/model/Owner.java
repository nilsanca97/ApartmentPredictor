package com.example.apartment_predictor.model;

import java.time.LocalDate;

public class Owner extends Person{

    private boolean isBusiness;
    private String idLegalOwner;
    private LocalDate registrationDate;
    private int qtyDaysAsOwner;

    //empty Constructor
    public Owner(){}

    // Constructor with all fields (including person attributes which inherence to owner class and owner attributes).
     public Owner(String fullName, LocalDate birthDate, String email, String password, boolean isActive, boolean isActive1, boolean isBusiness, LocalDate registrationDate, String idLegalOwner, int qtyDaysAsOwner) {
        super(fullName, birthDate, email, password, isActive);
        this.isBusiness = isBusiness;
        this.registrationDate = registrationDate;
        this.idLegalOwner = idLegalOwner;
        this.qtyDaysAsOwner = qtyDaysAsOwner;
    }

    // Getters & setters
    public boolean isBusiness() {
        return isBusiness;
    }

    public void setBusiness(boolean business) {
        isBusiness = business;
    }

    public String getIdLegalOwner() {
        return idLegalOwner;
    }

    public void setIdLegalOwner(String idLegalOwner) {
        this.idLegalOwner = idLegalOwner;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public int getQtyDaysAsOwner() {
        return qtyDaysAsOwner;
    }

    public void setQtyDaysAsOwner(int qtyDaysAsOwner) {
        this.qtyDaysAsOwner = qtyDaysAsOwner;
    }

    // toString method of Owner model class
    @Override
    public String toString() {
        return "Owner{" +
                "isBusiness=" + isBusiness +
                ", idLegalOwner='" + idLegalOwner + '\'' +
                ", registrationDate=" + registrationDate +
                ", qtyDaysAsOwner=" + qtyDaysAsOwner +
                "} " + super.toString();
    }
}
