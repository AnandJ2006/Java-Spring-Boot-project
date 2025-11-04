package com.Onlineexam.exam.repository;

import com.Onlineexam.exam.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

}