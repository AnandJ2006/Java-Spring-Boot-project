package com.Onlineexam.exam.service;

import com.Onlineexam.exam.model.Question;
import com.Onlineexam.exam.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    private final QuestionRepository repo;

    public QuestionService(QuestionRepository repo) {
        this.repo = repo;
    }

    public Question addQuestion(Question question) { return repo.save(question); }
    public List<Question> getAllQuestions() { return repo.findAll(); }
}
