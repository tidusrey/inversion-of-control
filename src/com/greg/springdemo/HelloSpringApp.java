package com.greg.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load spring configuration file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retrieve bean from spring container
		Coach theCoachs=context.getBean("myCoach",Coach.class);
		
		
		//call methods on the bean
		System.out.println(theCoachs.getDailyWorkOut());
		
		
		//close the context
        context.close();
	}

}
