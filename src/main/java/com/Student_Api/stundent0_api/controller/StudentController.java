package com.Student_Api.stundent0_api.controller;

import com.Student_Api.stundent0_api.model.Student;
import com.Student_Api.stundent0_api.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepository;
    @GetMapping("/students")
    public List<Student> getStudentData(){
        List<Student>student=studentRepository.findAll();
        return student;
    }
    //to get student details by using their id
    @GetMapping("/student/{id}")
    public  Student getstudent(@PathVariable int id){
        Student student = studentRepository.findById(id).get();
        return student;
    }
    @PostMapping("add")
    public String addStudent(@RequestBody Student student){
        studentRepository.save(student);
        return "Student added Sucessfully";
    }
    @DeleteMapping("{id}")
    public String deletestudentById(@PathVariable int id)
    {
        studentRepository.deleteById(id);
        return "Deleted Sucessfully";
    }
}
