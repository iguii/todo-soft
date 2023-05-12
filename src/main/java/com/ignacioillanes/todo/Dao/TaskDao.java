package com.ignacioillanes.todo.Dao;

import com.ignacioillanes.todo.Entity.Task;
import com.ignacioillanes.todo.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskDao{
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAllTasks();
    }


    public void save(Task task) {
        taskRepository.save(task);
    }
}
