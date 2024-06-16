package com.example.Student_Management_System.Repositry;

import com.example.Student_Management_System.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
