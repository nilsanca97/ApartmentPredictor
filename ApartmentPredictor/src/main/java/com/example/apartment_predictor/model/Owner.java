package com.example.apartment_predictor.model;

import java.time.LocalDate;

public class Owner extends Person{

    private boolean isActive;
    private boolean isBusiness;
    private String idLegalOwner;
    private LocalDate registrationDate;
    private int qtyDaysAsOwner;

    //empty Constructor
    public Owner(){}

    // Constructor with all fields (including person attributes which inherence to owner class and owner attributes).
    public Owner(String name, String surname, String email, String age, boolean isActive, String idLegalOwner, boolean isBusiness, LocalDate registrationDate, int qtyDaysAsOwner) {
        super(name, surname, email, age);
        this.isActive = isActive;
        this.idLegalOwner = idLegalOwner;
        this.isBusiness = isBusiness;
        this.registrationDate = registrationDate;
        this.qtyDaysAsOwner = qtyDaysAsOwner;
    }
    //Constructor (only with owner attributes)
    public Owner(boolean isActive, String idLegalOwner, boolean isBusiness, LocalDate registrationDate, int qtyDaysAsOwner) {
        this.isActive = isActive;
        this.idLegalOwner = idLegalOwner;
        this.isBusiness = isBusiness;
        this.registrationDate = registrationDate;
        this.qtyDaysAsOwner = qtyDaysAsOwner;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

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

    @Override
    public String toString() {
        return "Owner{" +
                "isActive=" + isActive +
                ", isBusiness=" + isBusiness +
                ", idLegalOwner='" + idLegalOwner + '\'' +
                ", registrationDate=" + registrationDate +
                ", qtyDaysAsOwner=" + qtyDaysAsOwner +
                "} " + super.toString();
    }
}
