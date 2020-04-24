package com.example.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.CustomerDetails;
import com.example.object.PaymentResponse;
import com.example.repository.CustomerRepository;

@RestController
@RequestMapping(value="/payments/")
public class PaymentController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@PostMapping(value="/save")
	public ResponseEntity<PaymentResponse> saveCustomer( @RequestBody CustomerDetails customerDetails) {
		
		ResponseEntity responseEntity = null; 
		PaymentResponse paymentResponse = new  PaymentResponse();
		customerDetails = customerRepository.save(customerDetails);
		paymentResponse.setReferenceId(customerDetails.getId());
		
		return responseEntity.status(HttpStatus.OK).body(paymentResponse);
	
		
	}
	
	
	
	
	
	
	
	

}
