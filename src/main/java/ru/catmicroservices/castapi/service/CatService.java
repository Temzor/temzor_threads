package ru.catmicroservices.castapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.catmicroservices.castapi.dto.CatDTO;
import ru.catmicroservices.castapi.entity.Cat;
import ru.catmicroservices.castapi.repository.CatRepository;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@AllArgsConstructor
public class CatService {
    private final CatRepository catRepository;

    public Cat save(CatDTO catDTO) {
        Cat cat = new Cat()
                .setName(catDTO.getName())
                .setBirthDay(catDTO.getBirthDay())
                .setId(UUID.randomUUID().toString())
                .setCreatedAt(LocalDateTime.now());
        return catRepository.save(cat);
    }

    public Iterable<Cat> getAll() {
        return catRepository.findAll();
    }
}
