package com.example.restaurants.entities;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomRestaurant", types = { Restaurant.class })

public interface RestaurantProjection {
	public String getNomRestaurant();

}
