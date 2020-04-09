package com.udacity.bootstrap.webcontroolers;

import com.udacity.bootstrap.entities.Dog;
import com.udacity.bootstrap.services.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {
    private DogService dogService;

    @Autowired
    public void setDogService(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping("/dogs")
    public ResponseEntity<List<Dog>> getAllDogs() {
        List<Dog> list = dogService.getAllDogs();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/lisofbreeds")
    public ResponseEntity<List<String>> getDogsBreed() {
        List<String> list = dogService.getAllDogBreeds();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/lisofdognames")
    public ResponseEntity<List<String>> getDogsNames() {
        List<String> list = dogService.getAllDogsNames();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}/breedbyid")
    public ResponseEntity<String> getDogById(@PathVariable Long id) {
        String list = dogService.getBreedById(id);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }


}
