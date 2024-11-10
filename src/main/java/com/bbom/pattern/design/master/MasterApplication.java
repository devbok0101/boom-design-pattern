package com.bbom.pattern.design.master;

import com.bbom.pattern.design.factory.PizzaTestDrive;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasterApplication.class, args);

		PizzaTestDrive pizzaTestDrive = new PizzaTestDrive();
		pizzaTestDrive.order();
	}

}
