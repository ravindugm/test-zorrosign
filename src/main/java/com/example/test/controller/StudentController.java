package com.example.test.controller;

import com.example.test.entity.Student;
import com.example.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public ArrayList<Student> getStudents() {
        return studentService.findAllStudents();
    }

    @PostMapping("/students")
    public void createStudents(@RequestBody Student student) {
        studentService.saveStudent(student);
    }

}
