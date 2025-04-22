package com.arcane.backend.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Table
@Data
@Entity
public class Faction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    @OneToOne
    @JoinColumn(name = "character_id")
    private Character leader;

    private String description;
    private String symbol;

    @CreationTimestamp
    private LocalDateTime createdAt;


    @OneToMany(mappedBy = "faction")
    @JsonManagedReference // Use to prevent Json Overflow
    private List<Character> characters;
}
