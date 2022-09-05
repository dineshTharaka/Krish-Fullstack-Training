package com.test.Spingboot_SOAP.api.service;

import java.time.LocalDate;
import java.time.Period;

import com.test.Spingboot_SOAP.api.agecalculator.CustomerRequest;
import org.springframework.stereotype.Service;

import com.test.Spingboot_SOAP.api.agecalculator.CustomerResponse;

@Service
public class AgeCalculatorService {
	
	public CustomerResponse checkAge (CustomerRequest request) {
		CustomerResponse response = new CustomerResponse();
		LocalDate birthdate = LocalDate.of(request.getYear(),request.getMonth(),request.getDay());
		LocalDate now = LocalDate.now();
		int years = Period.between(birthdate, now).getYears();
		response.setAge("you are "+years+" years old");
		return response;
		
	}

}
