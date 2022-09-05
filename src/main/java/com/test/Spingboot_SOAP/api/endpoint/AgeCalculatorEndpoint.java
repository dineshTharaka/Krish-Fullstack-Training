package com.test.Spingboot_SOAP.api.endpoint;

import com.test.Spingboot_SOAP.api.agecalculator.CustomerRequest;
import com.test.Spingboot_SOAP.api.service.AgeCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.test.Spingboot_SOAP.api.agecalculator.CustomerResponse;

@Endpoint
public class AgeCalculatorEndpoint {
	private static final String NAMESPACE="http://www.test.com/spring/soap/api/ageCalculator";
	@Autowired
	private AgeCalculatorService service;
	
	@PayloadRoot(namespace = NAMESPACE,localPart="CustomerRequest")
	@ResponsePayload
	public CustomerResponse getAgeDay(@RequestPayload CustomerRequest request) {
		return service.checkAge(request);
	}
}
