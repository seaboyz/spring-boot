package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApp {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApp.class, args);

		User newUser = new User();

		newUser.setUsername("seaboyz");

		System.out.println(newUser.getUsername());

	}

}
