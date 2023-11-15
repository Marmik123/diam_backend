package com.example.siam.diamservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.siam")
public class DiamServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiamServiceApplication.class, args);
	}

}
