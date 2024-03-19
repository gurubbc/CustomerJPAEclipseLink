package com.trainingguru.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerJpaEclipseLinkApplication implements CommandLineRunner{

	
	@Autowired
	CustomerRepository cs;
	public static void main(String[] args) {
		SpringApplication.run(CustomerJpaEclipseLinkApplication.class, args);
		System.out.println("JPA with Eclipse Link and also stand alone Started....");
	}

	@Override
	public void run(String... args) throws Exception {
		Customer c=new Customer(17, "kanna", "krishna", 38382L, "Guru");
		cs.save(c);
		System.out.println("Successfully saved");
		
	}

}
