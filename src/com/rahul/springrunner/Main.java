package com.rahul.springrunner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.springclass.Car;

public class Main {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:resources/spring.xml");
		Car car = (Car) app.getBean("C");
		car.print();
		

	}

}
