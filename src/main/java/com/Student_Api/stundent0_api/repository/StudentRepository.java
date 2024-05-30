package com.Student_Api.stundent0_api.repository;

import com.Student_Api.stundent0_api.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
