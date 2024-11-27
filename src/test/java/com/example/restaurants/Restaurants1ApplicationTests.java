package com.example.restaurants;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.restaurants.entities.Restaurant;
import com.example.restaurants.entities.Type;
import com.example.restaurants.repos.RestaurantRepository;
@SpringBootTest
class Restaurants1ApplicationTests {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Test
    public void testCreateRestaurant() {
        Restaurant restaurant = new Restaurant("El Gusto2", "456", new Date(), "info@elgusto.com");
        restaurantRepository.save(restaurant);
        assertNotNull(restaurant.getIdRestaurant());
    }

    @Test
    public void testFindRestaurant() {
        Restaurant r = restaurantRepository.findById(1L).get();
        System.out.println(r);
    }

    @Test
    public void testUpdateRestaurant() {
        Restaurant r = restaurantRepository.findById(1L).get();
        r.setNomRestaurant("Le Gourmet");
        r.setAdresseRestaurant("456 Rue de Paris");
        r.setDateOuverture(new Date());
        r.setEmail("contact@legourmet.com");
        restaurantRepository.save(r);
    }

    @Test
    public void testDeleteRestaurant() {
        restaurantRepository.deleteById(1L);
    }

    @Test
    public void testListerTousRestaurants() {
        List<Restaurant> restaurants = restaurantRepository.findAll();
        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }

    @Test
    public void testFindByNomRestaurant() {
        List<Restaurant> restaurants = restaurantRepository.findByNomRestaurant("Le Gourmet");
        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }

    @Test
    public void testFindByNomRestaurantContains() {
        List<Restaurant> restaurants = restaurantRepository.findByNomRestaurantContains("l");
        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }
    @Test
    public void testFindByNomAndAdresse() {
        List<Restaurant> restaurants = restaurantRepository.findByNomAndAdresse("Le Gourmet", "123 Rue Principale");
        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }
    @Test
    public void testFindByType() {
        Type type = new Type();
        type.setIdType(3L);
        List<Restaurant> restaurants = restaurantRepository.findByTypeRestaurant(type);
        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }
    @Test
    public void findByTypeIdType() {
        List<Restaurant> restaurants = restaurantRepository.findByTypeIdType(1L);
        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }
    @Test
    public void testFindByOrderByNomRestaurantAsc() {
        List<Restaurant> restaurants = restaurantRepository.findByOrderByNomRestaurantAsc();
        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }
    @Test
    public void testTrierRestaurantsParNomEtAdresse() {
        List<Restaurant> restaurants = restaurantRepository.trierRestaurantsParNomEtAdresse();
        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }

}
