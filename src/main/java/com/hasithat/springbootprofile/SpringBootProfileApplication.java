package com.hasithat.springbootprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
/*
* Below are the  supporting profiles by this application
* */
@Profile(value = {"dev","stg","prod"})
public class SpringBootProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfileApplication.class, args);
	}

}
