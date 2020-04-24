package com.example.object;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentResponse {
	

	@JsonProperty(value="ReferenceId")
	private String ReferenceId;
	
	public String getReferenceId() {
		return ReferenceId;
	}

	public void setReferenceId(String referenceId) {
		ReferenceId = referenceId;
	}

}
