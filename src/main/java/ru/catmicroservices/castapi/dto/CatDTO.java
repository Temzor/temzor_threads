package ru.catmicroservices.castapi.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CatDTO {
    private String name;
    private LocalDate birthDay;
}
