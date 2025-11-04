package com.Onlineexam.exam.controller;

import com.Onlineexam.exam.model.Feedback;
import com.Onlineexam.exam.service.FeedbackService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    private final FeedbackService service;

    public FeedbackController(FeedbackService service) {
        this.service = service;
    }

    @PostMapping
    public Feedback addFeedback(@RequestBody Feedback feedback) {
        return service.add(feedback);
    }


    @GetMapping
    public List<Feedback> getAllFeedback() {
        return service.all();
    }
}