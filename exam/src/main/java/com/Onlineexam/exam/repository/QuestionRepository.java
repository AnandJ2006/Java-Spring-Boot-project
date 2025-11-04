package com.Onlineexam.exam.repository;

import com.Onlineexam.exam.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
