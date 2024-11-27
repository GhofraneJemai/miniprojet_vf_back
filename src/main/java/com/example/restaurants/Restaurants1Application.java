package com.example.restaurants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.restaurants.entities.Restaurant;
import com.example.restaurants.entities.Type;

@SpringBootApplication
public class Restaurants1Application implements CommandLineRunner{
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(Restaurants1Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	    repositoryRestConfiguration.exposeIdsFor(Restaurant.class, Type.class);
	}

}
