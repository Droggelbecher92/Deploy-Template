package de.neuefische.backend.hangman;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hangmen")
public class HangmanController {


    @GetMapping
    public String sayHello(){

        return "_________";
    }

}
