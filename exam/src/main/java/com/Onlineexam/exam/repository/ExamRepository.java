package com.Onlineexam.exam.repository;

import com.Onlineexam.exam.model.Exam;
import com.Onlineexam.exam.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExamRepository extends JpaRepository<Exam, Integer> {
}
