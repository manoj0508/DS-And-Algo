package com.myapp.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.myapp.app.model.Department;

@Service
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
