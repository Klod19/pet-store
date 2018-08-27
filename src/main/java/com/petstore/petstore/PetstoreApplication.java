package com.petstore.petstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class PetstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetstoreApplication.class, args);
		Cat cat1 = new Cat("Chairman Meow",  2, "Grey", "Blue", "tiger");

		Dog dog1 = new Dog("Dork",3,"Yellow","Brown","Labbrador");

		cat1.eat();
		cat1.getRace();
		cat1.play();
		dog1.play();


	}


//	@Bean
//	public CommandLineRunner initData() {
//
//		return (args) -> {
//
//			Cat cat1 = new Cat("Chairman Meow", 2, "Grey", "Blue", "tiger");
//
//			cat1.get_cat_type();
//
//			System.out.println("fark");
//		};
//
//	}


}
