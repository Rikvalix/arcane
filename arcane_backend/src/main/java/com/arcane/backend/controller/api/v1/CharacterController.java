package com.arcane.backend.controller.api.v1;

import com.arcane.backend.entities.Character;
import com.arcane.backend.repositories.CharacterRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/character")
public class CharacterController {

    private final CharacterRepository characterRepository;

    CharacterController(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @GetMapping()
    List<Character> allCharacters() {
        return characterRepository.findAll();
    }

    @PostMapping()
    public String charactersPost() {
        return "TODO";
    }

    @GetMapping("/{id}")
    public ResponseEntity<Character> charactersGet(@PathVariable Long id) {
        Optional<Character> character = characterRepository.findById(id);

        return character.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    /*
    Implements
     /characters/{id}  -> DELETE
     /characters/{id} -> PUT
     */
}
