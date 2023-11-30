package ru.catmicroservices.castapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.catmicroservices.castapi.dto.CatDTO;
import ru.catmicroservices.castapi.entity.Cat;
import ru.catmicroservices.castapi.service.CatService;


@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {
    private final CatService catService;

    @PostMapping
    public Cat save(CatDTO cat) {
        return catService.save(cat);
    }

    @GetMapping
    public Iterable<Cat> getAll() {
        return catService.getAll();
    }
}
