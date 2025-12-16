package com.example.apartment_predictor;

import com.example.apartment_predictor.model.Apartment;
import com.example.apartment_predictor.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApartmentPredictorApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ApartmentPredictorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

	
	private void printApartmentDetails(Apartment apartment, String description) {
		System.out.println("\n" + description + ":");
		System.out.println("  Price: $" + apartment.getPrice());
		System.out.println("  Area: " + apartment.getArea() + " sq ft");
		System.out.println("  Bedrooms: " + apartment.getBedrooms());
		System.out.println("  Bathrooms: " + apartment.getBathrooms());
		System.out.println("  Stories: " + apartment.getStories());
		System.out.println("  Main Road Access: " + apartment.getMainroad());
		System.out.println("  Guest Room: " + apartment.getGuestroom());
		System.out.println("  Basement: " + apartment.getBasement());
		System.out.println("  Hot Water Hiting: " + apartment.getHotwaterheating());
		System.out.println("  Air Conditioning: " + apartment.getAirconditioning());
		System.out.println("  Parking Spaces: " + apartment.getParking());
		System.out.println("  Preferred Area: " + apartment.getPrefarea());
		System.out.println("  Furnishing Status: " + apartment.getFurnishingstatus());
	}

}
