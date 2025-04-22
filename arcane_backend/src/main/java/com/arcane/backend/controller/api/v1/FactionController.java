package com.arcane.backend.controller.api.v1;

import com.arcane.backend.dto.FactionDTO;
import com.arcane.backend.entities.Faction;
import com.arcane.backend.repositories.FactionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/faction")
public class FactionController {

    private final FactionRepository factionRepository;

    FactionController(FactionRepository factionRepository) {
        this.factionRepository = factionRepository;
    }

    @GetMapping
    public ResponseEntity<List<FactionDTO>> getAllFactions() {
        List<FactionDTO> factions = factionRepository.findAll()
                .stream()
                .map(FactionDTO::fromEntity)
                .toList();
        return ResponseEntity.ok(factions);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FactionDTO> getFactionById(@PathVariable Long id) {
        Optional<Faction> faction = factionRepository.findById(id);

        return faction.map(fact -> ResponseEntity.ok(FactionDTO.fromEntity(fact)))
                .orElse(ResponseEntity.notFound().build());
    }


}
