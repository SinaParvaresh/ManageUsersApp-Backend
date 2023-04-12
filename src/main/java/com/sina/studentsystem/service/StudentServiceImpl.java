package com.sina.studentsystem.service;

import com.sina.studentsystem.model.Student;
import com.sina.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    // Injects the Student Repo into our service class
    @Autowired
    private StudentRepository studentRepository;

    //overide method
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }


    //This will get all students from the database
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
