package com.example.backend.services;

import com.example.backend.entities.Course;
import com.example.backend.entities.Student;

import java.util.List;
import java.util.Set;

public interface CourseService {
    Course getCourse(Long id);
    Course saveCourse(Course course);

    void deleteCourse(Long id);

    List<Course> getCourses();
    Course addStudentToCourse(Long studentId, Long courseId);
    Set<Student> getEnrolledStudents(Long id);
}
