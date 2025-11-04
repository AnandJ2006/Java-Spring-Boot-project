package com.Onlineexam.exam.model;

import jakarta.persistence.*;



@Entity
@Table(name = "feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public Long userId;
    public Long examId;
    public String comments;
    public int rating;

    public Feedback() {}
}