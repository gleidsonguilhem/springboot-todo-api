package com.gleidson.taskmanager.service;

import com.gleidson.taskmanager.model.Task;
import com.gleidson.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TaskService {
    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Optional<Task> getTaskById(Long id) {
        return repository.findById(id);
    }

    public Task creaTask(Task task) {
        return repository.save(task);
    }

    public Optional<Task> updateTask(Long id, Task updateTask) {
        return repository.findById(id).map(task -> {
            task.setTitle(updateTask.getTitle());
            task.setDescription(updateTask.getDescription());
            task.setCompleted(updateTask.getCompleted());
            return repository.save(task);
        });
    }

    public void deleteTask(Long id) {
        repository.deleteById(id);
    }
}
