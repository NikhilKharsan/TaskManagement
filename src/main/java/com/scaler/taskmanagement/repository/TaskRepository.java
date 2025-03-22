package com.scaler.taskmanagement.repository;

import com.scaler.taskmanagement.model.Task;
import com.scaler.taskmanagement.model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(TaskStatus status);
    List<Task> findByDueDateBefore(LocalDateTime date);
    List<Task> findByTitleContaining(String keyword);
}