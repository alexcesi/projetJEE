package com.projetJEE;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.projetJEE")
public class ProjetJeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetJeeApplication.class, args);
	}

}
