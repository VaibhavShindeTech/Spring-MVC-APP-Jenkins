package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Serializable> {

}
