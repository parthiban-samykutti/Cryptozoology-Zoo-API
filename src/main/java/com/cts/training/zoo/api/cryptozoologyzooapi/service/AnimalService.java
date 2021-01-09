package com.cts.training.zoo.api.cryptozoologyzooapi.service;

import com.cts.training.zoo.api.cryptozoologyzooapi.entity.Animal;
import com.cts.training.zoo.api.cryptozoologyzooapi.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    @Autowired
    AnimalRepository animalRepository;

    public Animal addAnimal(Animal animal) {
        return animalRepository.save(animal);
    }
}
