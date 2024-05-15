package com.StudentService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentService.entity.StudentService;

public interface StudentRepository extends JpaRepository<StudentService, Integer> {

	<Student> Student saveAll(Student s);


}
