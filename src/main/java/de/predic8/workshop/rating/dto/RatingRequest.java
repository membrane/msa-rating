package de.predic8.workshop.rating.dto;

import java.math.BigDecimal;

public class RatingRequest {
	private String customer;
	private BigDecimal amount;

	public RatingRequest() {
	}

	public RatingRequest(String customer, BigDecimal amount) {
		this.customer = customer;
		this.amount = amount;
	}

	public String getCustomer() {
		return this.customer;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public String toString() {
		return "RatingRequest(customer=" + customer + ", amount=" + amount + ")";
	}
}