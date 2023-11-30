package ru.catmicroservices.castapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.catmicroservices.castapi.entity.Cat;

public interface CatRepository extends JpaRepository<Cat, String> {

}
