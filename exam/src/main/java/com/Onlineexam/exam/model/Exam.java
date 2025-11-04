package com.Onlineexam.exam.model;

import jakarta.persistence.*;

@Entity
@Table(name = "exam")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String title;
    public String subject;
    public int totalMarks;

    public Exam() {}
}