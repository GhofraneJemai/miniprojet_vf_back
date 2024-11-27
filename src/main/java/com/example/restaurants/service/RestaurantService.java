package com.example.restaurants.service;

import java.util.List;

import com.example.restaurants.entities.Restaurant;
import com.example.restaurants.entities.Type;

public interface RestaurantService {
	Restaurant saveRestaurant(Restaurant r);
	Restaurant updateRestaurant(Restaurant r);
	void deleteRestaurant(Restaurant r);
	void deleteRestaurantById(Long id);
	Restaurant getRestaurant(Long id);
	List<Restaurant> getAllRestaurants();
	List<Restaurant> findByNomRestaurant(String nom);
    List<Restaurant> findByNomRestaurantContains(String nom);
    List<Restaurant> findByNomAndAdresse(String nom, String adresse);
    List<Restaurant> findByTypeRestaurant(Type type);
    List<Restaurant> findByTypeIdType(Long id);
    List<Restaurant> findByOrderByNomRestaurantAsc();
    List<Restaurant> trierRestaurantsParNomEtAdresse();

}
