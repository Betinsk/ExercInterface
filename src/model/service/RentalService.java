package model.service;

import entities.CarRental;

public class RentalService {

	private Double pricePerDay;
	private Double pricePerHour;
	
	private BrazilTaxService brazilTaxService;
	
	public RentalService() {
	}

	public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService brazilTaxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.brazilTaxService = brazilTaxService;
	}
	
	public void processInvoice(CarRental carRental) {
		
		
	}
	

}
