package com.arcane.backend.dto;

import com.arcane.backend.entities.Faction;
import java.util.List;

// Here i don't use Lombok (training in Java)

public class FactionDTO {
    private Long id;
    private String name;
    private String description;
    private String symbol;
    private List<CharacterDTO> characters;

    public FactionDTO(Long id, String name, String description, String symbol, List<CharacterDTO> characters) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.symbol = symbol;
        this.characters = characters;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public List<CharacterDTO> getCharacters() {
        return characters;
    }
    public void setCharacters(List<CharacterDTO> characters) {
        this.characters = characters;
    }

    public static FactionDTO fromEntity(Faction faction) {

        List<CharacterDTO> characters = faction.getCharacters().stream()
                .map(CharacterDTO::fromEntity)
                .toList();

        return new FactionDTO(
                faction.getId(),
                faction.getName(),
                faction.getDescription(),
                faction.getSymbol(),
                characters

        );
    }
}
