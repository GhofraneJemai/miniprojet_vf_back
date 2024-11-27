package com.example.restaurants.repos;

import com.example.restaurants.entities.Type;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.restaurants.entities.Restaurant;
@RepositoryRestResource(path = "rest")
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
	List<Restaurant> findByNomRestaurant(String nom);
	List<Restaurant> findByNomRestaurantContains(String nom);
	/*@Query("select r from Restaurant r where r.nomRestaurant like %?1% and r.adresseRestaurant like %?2%")
    List<Restaurant> findByNomAndAdresse(String nom, String adresse);*/
	@Query("select r from Restaurant r where r.nomRestaurant like %:nom and r.adresseRestaurant like %:adresse")
    List<Restaurant> findByNomAndAdresse(@Param("nom") String nom, @Param("adresse") String adresse);
	@Query("select r from Restaurant r where r.type = ?1")
    List<Restaurant> findByTypeRestaurant(Type type);
	List<Restaurant> findByTypeIdType(Long id);
	List<Restaurant> findByOrderByNomRestaurantAsc();
	@Query("select r from Restaurant r order by r.nomRestaurant ASC, r.adresseRestaurant DESC")
	List<Restaurant> trierRestaurantsParNomEtAdresse();
}
