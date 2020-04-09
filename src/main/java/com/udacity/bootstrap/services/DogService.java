package com.udacity.bootstrap.services;

import com.udacity.bootstrap.entities.Dog;

import java.util.List;

public interface DogService {
    List<Dog> getAllDogs();
    List<String> getAllDogBreeds();
    List<String> getAllDogsNames();
    String getBreedById(Long id);

}
