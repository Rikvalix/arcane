package com.arcane.backend.entities;

import com.arcane.backend.enums.CharactersStatusEnum;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Table // corresponding table that matches that entity in the database
@Data // Getter and setter
@Entity  // for specifies class is a entity and is mapped
@Getter // Lombok Getter
@Setter // Lombok Setter
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String firstName;

    @Nullable
    private String lastName;

    private String nickName;
    private Integer age;
    private String gender;
    private String race;

    // Many to one to faction
    @ManyToOne
    @JoinColumn(name = "faction_id")  // Foreign key
    @JsonBackReference // Use to prevent Json Overflow
    private Faction faction;

    private String alignment;
    private String birthplace;
    private String occupation;
    @Column(length = 500)
    private String appearance;
    @Column(length = 500)
    private String personality;
    @Column(length = 500)
    private String backstory;

    @Enumerated(EnumType.STRING)
    private CharactersStatusEnum status;
    private String imageUrl;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
