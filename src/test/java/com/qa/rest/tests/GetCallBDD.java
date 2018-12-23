package com.qa.rest.tests;

import org.testng.annotations.Test;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matcher.*;

public class GetCallBDD {
	
	@Test
	public void test_numberOFCircutitsFor2017_Season() {
	
		
		given().
		when().
			get("http://ergast.com/api/f1/2017/circuits.json").
		then().
			assertThat().
			and().
			statusCode(200).
			body("MRData.CircuitTable.Circuits.circuitId", hasSize(20)).
			and().
			header("content-length", equalTo("4551"));
			
		
		
		 
	}

	private ResponseAwareMatcher<Response> hasSize(int i) {
		 //TODO Auto-generated method stub
	return hasSize(20);
	} 

	

}
