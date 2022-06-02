package de.neuefische.backend.hangman;

import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/hangmen")
public class HangmanController {

    private final String SOLUTION = "HalloWelt".toUpperCase(Locale.ROOT);
    private Set<String> guessedLetters = ConcurrentHashMap.newKeySet();


    @GetMapping
    public String sayHello(){
        return hideUnknownLetters();
    }

    @PostMapping("/{letter}")
    public String checkForLetter(@PathVariable String letter){
        guessedLetters.add(letter.toUpperCase(Locale.ROOT));
        return hideUnknownLetters();
    }

    private String hideUnknownLetters() {
        return Stream.of(SOLUTION.split("(?!^)"))
                .map(l -> guessedLetters.contains(l) ? l : "_")
                .collect(Collectors.joining());
    }

}
