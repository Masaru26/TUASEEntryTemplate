package com.example.aseentrytesttemplate.controller;

import com.example.aseentrytesttemplate.entity.EntityClass;
import com.example.aseentrytesttemplate.repository.RepositoryClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("path")
public class Controller {

    private final RepositoryClass repositoryClass;

    public Controller(RepositoryClass repositoryClass) {
        this.repositoryClass = repositoryClass;
    }

    @GetMapping("path")
    public Iterable<EntityClass> getAllEntityClass() {
        return repositoryClass.getAllEntites();
    }

}
