package com.arcane.backend.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Table
@Data
@Entity
@Getter
@Setter
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;
    private String region;
    private String description;
    private String imageUrl;
    @CreationTimestamp
    private LocalDateTime created_at;

    // Constructor is manage by lombok


}
