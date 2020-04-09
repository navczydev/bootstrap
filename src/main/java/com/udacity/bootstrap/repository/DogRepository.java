package com.udacity.bootstrap.repository;

import com.udacity.bootstrap.entities.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog, Long> {

    @Query("select dog from Dog dog where dog.id = :id")
    Dog findDogById(Long id);

    @Query("select dog.breed from Dog dog")
    List<String> getBreeds();

    @Query("select dog.name from Dog dog")
    List<String> getDogsNames();

    @Query("select dog.breed from Dog dog where dog.id = :id")
    String getDogBreedById(Long id);
}
