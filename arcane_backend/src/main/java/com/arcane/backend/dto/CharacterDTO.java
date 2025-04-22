package com.arcane.backend.dto;

import com.arcane.backend.entities.Character;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor // Made automatically constructor
public class CharacterDTO {
    private Long id;
    private String firstname;
    private String lastname;
    private String nickname;
    private String imageUrl;

    public static CharacterDTO fromEntity(Character character) {
        return new CharacterDTO(
                character.getId(),
                character.getFirstName(),
                character.getLastName(),
                character.getNickName(),
                character.getImageUrl()
        );
    }
}


