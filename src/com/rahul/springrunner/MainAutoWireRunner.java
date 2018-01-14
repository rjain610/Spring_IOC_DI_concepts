package com.rahul.springrunner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.springclass.Car;

public class MainAutoWireRunner {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:resources/autowirespring.xml");
		Car car = (Car) app.getBean("C");
		car.print();
		

	}
}
