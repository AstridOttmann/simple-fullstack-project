package com.example.backend.services;

import com.example.backend.entities.Course;
import com.example.backend.entities.Student;

import java.util.List;

public interface StudentService {
    Student getStudent(Long id);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> getStudents();
    List<Course> getEnrolledCourses(Long id);
}