package com.arcane.backend.repositories;

import com.arcane.backend.entities.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {


}
