package com.Onlineexam.exam.service;

import com.Onlineexam.exam.model.Exam;
import com.Onlineexam.exam.repository.ExamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamService {
    private final ExamRepository repo;

    public ExamService(ExamRepository repo) {
        this.repo = repo;
    }

    public Exam addExam(Exam exam) { return repo.save(exam); }
    public List<Exam> getAllExams() { return repo.findAll(); }
}
