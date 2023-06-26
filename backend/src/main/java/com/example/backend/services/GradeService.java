package com.example.backend.services;

import com.example.backend.entities.Grade;
import org.springframework.stereotype.Service;


public interface GradeService {
    Grade saveGrade(Grade grade, Long studentId, Long courseId);
}
