package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "CustomersData")
public class CustomerDetails {
		@Id
	    @GeneratedValue
	    @Column(name="REFERENCEID")
	    private String id;
	  
		@Column(name="LAST4SSN")
	    private String last4SSN;
	    
		@Column(name="LASTNAME")
	    private String lastName;
	
	    @Column(name="CARDNUMBER")
	    private String cardNumber;
	    
	    @Column(name="CHEQUENUMBER ")
	    private String checkNumber;
	    
	    @Column(name="AMOUNT")
	    private String amount;

		public String getAmount() {
			return amount;
		}

		public void setAmount(String amount) {
			this.amount = amount;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getLast4SSN() {
			return last4SSN;
		}

		public void setLast4SSN(String last4ssn) {
			last4SSN = last4ssn;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getCardNumber() {
			return cardNumber;
		}

		public void setCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
		}

		public String getCheckNumber() {
			return checkNumber;
		}

		public void setCheckNumber(String checkNumber) {
			this.checkNumber = checkNumber;
		}
	    
	    


}
