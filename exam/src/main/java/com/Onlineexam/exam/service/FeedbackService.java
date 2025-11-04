package com.Onlineexam.exam.service;

import com.Onlineexam.exam.model.Feedback;
import com.Onlineexam.exam.repository.FeedbackRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    private final FeedbackRepository repo;

    public FeedbackService(FeedbackRepository repo) {
        this.repo = repo;
    }

    public Feedback add(Feedback feedback) {
        return repo.save(feedback);
    }

    public List<Feedback> all() {
        return repo.findAll();
    }
}