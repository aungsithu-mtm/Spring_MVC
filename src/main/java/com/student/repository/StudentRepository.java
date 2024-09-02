package com.student.repository;

import com.student.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Employee, Long> {}
