package com.Student_Api.stundent0_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)//to generate automatically unique id
    private int studentId;
    @Column
    private String studentName;
    @Column
    private double studentMarks;
    @Column
    private String studentBranch;
}
