package com.Onlineexam.exam.controller;

import com.Onlineexam.exam.model.Question;
import com.Onlineexam.exam.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
@CrossOrigin(origins = "*")
public class QuestionController {
    private final QuestionService service;

    public QuestionController(QuestionService service) {
        this.service = service;
    }

    @PostMapping
    public Question createQuestion(@RequestBody Question question) {
        return service.addQuestion(question);
    }

    @GetMapping
    public List<Question> getAllQuestions() {
        return service.getAllQuestions();
    }
}