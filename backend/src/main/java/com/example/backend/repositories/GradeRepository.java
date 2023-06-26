package com.example.backend.repositories;

import com.example.backend.entities.Grade;
import org.springframework.data.repository.CrudRepository;

public interface GradeRepository extends CrudRepository<Grade, Long> {
}

