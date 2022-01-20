package de.neuefische.backend.controller;


import de.neuefische.backend.model.Something;
import de.neuefische.backend.service.SomethingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SomethingController {

    private final SomethingService somethingService;


    public SomethingController(SomethingService somethingService) {
        this.somethingService = somethingService;
    }

    @GetMapping
    public List<Something> checkWorking(){
        somethingService.addNewSomething(Something.builder().name("I´ll be back!").build());
        return somethingService.getAll();
    }

}
