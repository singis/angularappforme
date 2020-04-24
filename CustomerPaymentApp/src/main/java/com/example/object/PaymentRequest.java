package com.example.object;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentRequest {
	
	@JsonProperty(value="lastName")
	private String lastName;
	
	@JsonProperty(value="last4SSN")
	private String last4SSN;
	
	@JsonProperty(value="cardNumber")
	private String cardNumber;
	
	@JsonProperty(value="amount")
	private String amount;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLast4SSN() {
		return last4SSN;
	}

	public void setLast4SSN(String last4ssn) {
		last4SSN = last4ssn;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	

}
