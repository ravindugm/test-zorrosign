package com.example.test.service;

import com.example.test.entity.Student;

import java.util.ArrayList;

public interface StudentService {

    public void saveStudent(Student student);

    public ArrayList<Student> findAllStudents();

}
