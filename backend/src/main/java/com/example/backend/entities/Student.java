package com.example.backend.entities;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

}
