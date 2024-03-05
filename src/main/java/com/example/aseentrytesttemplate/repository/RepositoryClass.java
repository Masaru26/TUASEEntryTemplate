package com.example.aseentrytesttemplate.repository;

import com.example.aseentrytesttemplate.entity.EntityClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RepositoryClass extends JpaRepository<EntityClass, Integer> {

    @Query(value="SELECT * FROM entity_class;", nativeQuery = true)
    List<EntityClass> getAllEntites();
}
