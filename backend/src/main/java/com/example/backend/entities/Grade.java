package com.example.backend.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "grade", uniqueConstraints={
        @UniqueConstraint(columnNames = {"student_id", "course_id"})
})
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "score", nullable = false)
    private String score;

    @ManyToOne(optional = false)
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;

    @ManyToOne(optional = false)
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private Course course;
}
