package com.arcane.backend.repositories;

import com.arcane.backend.entities.Faction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactionRepository extends JpaRepository<Faction, Long> {


}
