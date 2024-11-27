package com.example.restaurants.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restaurants.entities.Restaurant;
import com.example.restaurants.entities.Type;
import com.example.restaurants.repos.RestaurantRepository;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    RestaurantRepository restaurantRepository;

    @Override
    public Restaurant saveRestaurant(Restaurant r) {
        return restaurantRepository.save(r);
    }

    @Override
    public Restaurant updateRestaurant(Restaurant r) {
        return restaurantRepository.save(r);
    }

    @Override
    public void deleteRestaurant(Restaurant r) {
        restaurantRepository.delete(r);
    }

    @Override
    public void deleteRestaurantById(Long id) {
        restaurantRepository.deleteById(id);
    }

    @Override
    public Restaurant getRestaurant(Long id) {
        return restaurantRepository.findById(id).orElse(null);
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }
    @Override
    public List<Restaurant> findByNomRestaurant(String nom) {
        return restaurantRepository.findByNomRestaurant(nom);
    }

    @Override
    public List<Restaurant> findByNomRestaurantContains(String nom) {
        return restaurantRepository.findByNomRestaurantContains(nom);
    }

    @Override
    public List<Restaurant> findByNomAndAdresse(String nom, String adresse) {
        return restaurantRepository.findByNomAndAdresse(nom, adresse);
    }

    @Override
    public List<Restaurant> findByTypeRestaurant(Type type) {
        return restaurantRepository.findByTypeRestaurant(type);
    }

    @Override
    public List<Restaurant> findByTypeIdType(Long id) {
        return restaurantRepository.findByTypeIdType(id);
    }

    @Override
    public List<Restaurant> findByOrderByNomRestaurantAsc() {
        return restaurantRepository.findByOrderByNomRestaurantAsc();
    }

    @Override
    public List<Restaurant> trierRestaurantsParNomEtAdresse() {
        return restaurantRepository.trierRestaurantsParNomEtAdresse();
    }
}
