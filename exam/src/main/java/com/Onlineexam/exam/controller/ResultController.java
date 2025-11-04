package com.Onlineexam.exam.controller;

import com.Onlineexam.exam.model.Result;
import com.Onlineexam.exam.service.ResultService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/results")
@CrossOrigin(origins = "*")
public class ResultController {
    private final ResultService service;

    public ResultController(ResultService service) {
        this.service = service;
    }

    @PostMapping
    public Result createResult(@RequestBody Result result) {
        return service.addResult(result);
    }

    @GetMapping
    public List<Result> getAllResults() {
        return service.getAllResults();
    }
}
