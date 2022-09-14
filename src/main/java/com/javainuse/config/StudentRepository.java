package com.javainuse.config;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javainuse.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
