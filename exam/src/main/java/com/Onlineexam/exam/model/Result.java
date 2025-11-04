package com.Onlineexam.exam.model;

import jakarta.persistence.*;

@Entity
@Table(name = "result")
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String username;
    public String examTitle;
    public int score;

    public Result() {}
}