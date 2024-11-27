package com.example.restaurants.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurants.entities.Restaurant;
import com.example.restaurants.service.RestaurantService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class RestaurantRESTController {
    @Autowired
    RestaurantService restaurantService;

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET)
    public Restaurant getRestaurantById(@PathVariable("id") Long id) {
        return restaurantService.getRestaurant(id);
    }

    @RequestMapping(path = "/addrest", method = RequestMethod.POST)
    public Restaurant createRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.saveRestaurant(restaurant);
    }

    @RequestMapping(path = "/updaterest", method = RequestMethod.PUT)
    public Restaurant updateRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.updateRestaurant(restaurant);
    }

    @RequestMapping(value = "/delrest/{id}", method = RequestMethod.DELETE)
    public void deleteRestaurant(@PathVariable("id") Long id) {
        restaurantService.deleteRestaurantById(id);
    }

    @RequestMapping(value = "/restbytype/{idType}", method = RequestMethod.GET)
    public List<Restaurant> findByTypeId(@PathVariable("idType") Long idType) {
        return restaurantService.findByTypeIdType(idType);
    }

    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    public List<Restaurant> sortRestaurantsByNameAndAddress() {
        return restaurantService.trierRestaurantsParNomEtAdresse();
    }
}
