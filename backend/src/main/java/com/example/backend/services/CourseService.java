package com.example.backend.services;

import com.example.backend.entities.Course;
import com.example.backend.entities.Student;

import java.util.List;

public interface CourseService {
    Course getCourse(Long id);
    Course saveCourse(Course course);

    void deleteCourse(Long id);

    List<Course> getCourses();
    Course addStudentToCourse(Long studentId, Long courseId);
    List<Student> getEnrolledStudents(Long id);
}
