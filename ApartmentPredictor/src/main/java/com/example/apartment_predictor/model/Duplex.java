package com.example.apartment_predictor.model;

import java.util.List;
import java.util.UUID;

public class Duplex extends Apartment {

    private String balcony;
    private String elevator;
    private boolean hasSeparateUtilities;


    public Duplex() {
        this.id = UUID.randomUUID().toString();
    }

    public Duplex(double area, int locationRating, String address, int numberOfBedrooms, int numberOfBathrooms, boolean hasGarden, Long price, Integer bedrooms, Integer bathrooms, Integer stories, String mainroad, String guestroom, String basement, String hotwaterheating, String airconditioning, Integer parking, String prefarea, boolean hasBalcony, String furnishingstatus, int floorLevel, List<Review> reviews, String balcony, String elevator, boolean hasSeparateUtilities) {
        super(area, locationRating, address, numberOfBedrooms, numberOfBathrooms, hasGarden, price, bedrooms, bathrooms, stories, mainroad, guestroom, basement, hotwaterheating, airconditioning, parking, prefarea, hasBalcony, furnishingstatus, floorLevel, reviews);
        this.balcony = balcony;
        this.elevator = elevator;
        this.hasSeparateUtilities = hasSeparateUtilities;
    }

    public String getBalcony() {
        return balcony;
    }

    public void setBalcony(String balcony) {
        this.balcony = balcony;
    }

    public String getElevator() {
        return elevator;
    }

    public void setElevator(String elevator) {
        this.elevator = elevator;
    }

    public boolean isHasSeparateUtilities() {
        return hasSeparateUtilities;
    }

    public void setHasSeparateUtilities(boolean hasSeparateUtilities) {
        this.hasSeparateUtilities = hasSeparateUtilities;
    }

    @Override
    public String toString() {
        return "Duplex{" +
                "id='" + id + '\'' +
                ", balcony='" + balcony + '\'' +
                ", elevator='" + elevator + '\'' +

                '}';
    }

    // inherits isSuitableForFamily (from ResidentialProperty) and adds new conditions
    @Override
    public boolean isSuitableForFamily(int familySize) {

        if (super.isSuitableForFamily(familySize) && familySize >= 4) {
            return true;
        } else return false;
        //return super.isSuitableForFamily(familySize) && familySize >= 4;
    }
}
