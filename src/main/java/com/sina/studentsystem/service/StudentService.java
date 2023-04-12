package com.sina.studentsystem.service;

import com.sina.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    //Get from database
    public List<Student> getAllStudents();
}
