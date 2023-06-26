package com.example.backend.controllers;

import com.example.backend.services.CourseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {
    CourseService courseService;
}
