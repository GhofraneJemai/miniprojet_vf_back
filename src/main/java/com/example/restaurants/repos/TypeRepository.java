package com.example.restaurants.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.restaurants.entities.Type;

@RepositoryRestResource(path = "type") // Le chemin d'accès pour cette ressource
@CrossOrigin("http://localhost:4200/")  // Permet d'accepter les requêtes provenant de l'application Angular
public interface TypeRepository extends JpaRepository<Type, Long> {
}
