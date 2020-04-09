package com.udacity.bootstrap.services;

import com.udacity.bootstrap.entities.Dog;
import com.udacity.bootstrap.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogServiceImpl implements DogService {
    @Autowired
    DogRepository dogRepository;

    public List<Dog> getAllDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    @Override
    public List<String> getAllDogBreeds() {
        return dogRepository.getBreeds();
    }

    @Override
    public List<String> getAllDogsNames() {
        return dogRepository.getDogsNames();
    }


    @Override
    public String getBreedById(Long id) {
        Optional<String> list = Optional.ofNullable(dogRepository.getDogBreedById(id));
        String breed = list.orElseThrow(DogNotFoundException::new);
        return breed;
    }

}
