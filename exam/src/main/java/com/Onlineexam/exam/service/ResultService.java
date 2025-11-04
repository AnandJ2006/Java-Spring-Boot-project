package com.Onlineexam.exam.service;


import com.Onlineexam.exam.model.Result;
import com.Onlineexam.exam.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultService {
    @Autowired
    private  ResultRepository repo;

    public ResultService(ResultRepository repo) {
        this.repo = repo;
    }

    public Result addResult(Result result) { return repo.save(result); }
    public List<Result> getAllResults() { return repo.findAll(); }
}
