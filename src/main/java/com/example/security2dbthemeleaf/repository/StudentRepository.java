package com.example.security2dbthemeleaf.repository;

import com.example.security2dbthemeleaf.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
