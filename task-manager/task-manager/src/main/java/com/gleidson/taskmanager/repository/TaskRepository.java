package com.gleidson.taskmanager.repository;
import com.gleidson.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository extends JpaRepository<Task, Long> {}
