package com.example.test.service;

import com.example.test.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentServiceImpl implements StudentService {

    ArrayList<Student> studentList = new ArrayList<>();

    @Override
    public void saveStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public ArrayList<Student> findAllStudents() {
        return studentList;
    }
}
