package com.greg.springdemo;

public class TennisCoach implements Coach {

	
	@Override 
	public String getDailyWorkOut() {
		return "Tennis coach will teach them how to serve today";
	}
}
