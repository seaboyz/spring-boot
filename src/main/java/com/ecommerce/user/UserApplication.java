package com.ecommerce.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);

		User newUser = new User();

		newUser.setUsername("seaboyz");

		System.out.println(newUser.getUsername());

	}

}
