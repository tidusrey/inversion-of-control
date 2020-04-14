package com.greg.springdemo;

public class MyApp {

	public static void main(String[] args) {
	
		
		
//		create an object
Coach theCoach= new BasketballCoach();
Coach nextCoach= new FootballCoach();

// use a method of the object
System.out.println(theCoach.getDailyWorkOut());
System.out.println(nextCoach.getDailyWorkOut());

	}

}
