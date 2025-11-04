package com.Onlineexam.exam.controller;

import com.Onlineexam.exam.model.Exam;
import com.Onlineexam.exam.service.ExamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exams")
@CrossOrigin(origins = "*")
public class ExamController {
    private final ExamService service;

    public ExamController(ExamService service) {
        this.service = service;
    }

    @PostMapping
    public Exam createExam(@RequestBody Exam exam) {
        return service.addExam(exam);
    }

    @GetMapping
    public List<Exam> getAllExams() {
        return service.getAllExams();
    }
}