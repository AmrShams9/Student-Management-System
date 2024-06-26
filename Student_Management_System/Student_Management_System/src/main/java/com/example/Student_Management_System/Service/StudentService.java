package com.example.Student_Management_System.Service;

import com.example.Student_Management_System.Entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    void saveStudent(Student student);

    Student getStudentById(Long id);

    void updateStudent(Student student);

    void deleteStudentById(Long id);
}
