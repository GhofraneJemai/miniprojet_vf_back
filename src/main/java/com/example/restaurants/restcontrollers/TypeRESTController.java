package com.example.restaurants.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurants.entities.Type;
import com.example.restaurants.repos.TypeRepository;

@RestController
@RequestMapping("/api/type")
@CrossOrigin("*")
public class TypeRESTController {

    @Autowired
    private TypeRepository typeRepository;  // Injection de TypeRepository

    
    @RequestMapping(method = RequestMethod.GET)
    public List<Type> getAllTypes() {
        return typeRepository.findAll();
    }

    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Type getTypeById(@PathVariable("id") Long id) {
        return typeRepository.findById(id).orElse(null);
    }

    
    @RequestMapping(method = RequestMethod.POST)
    public Type createType(@RequestBody Type type) {
        return typeRepository.save(type);
    }

    
    @RequestMapping(method = RequestMethod.PUT)
    public Type updateType(@RequestBody Type type) {
        return typeRepository.save(type);
    }

   
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteType(@PathVariable("id") Long id) {
        typeRepository.deleteById(id);
    }
    
}
