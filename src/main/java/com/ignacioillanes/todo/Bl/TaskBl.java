package com.ignacioillanes.todo.Bl;

import com.ignacioillanes.todo.Dao.TaskDao;
import com.ignacioillanes.todo.Dto.LabelDto;
import com.ignacioillanes.todo.Dto.TaskDto;
import com.ignacioillanes.todo.Entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskBl {
    @Autowired
    private TaskDao taskDao;

    @Autowired
    private LabelBl labelBl;

    public List<TaskDto> getAllTasks() {
        List<Task> tasks = taskDao.getAllTasks();

        List<LabelDto> labels = labelBl.getAllLabels();

        List<TaskDto> res = new ArrayList<>();

        tasks.forEach(task -> {
            res.add(new TaskDto(task.getTaskId(), task.getDescription(), task.getCompleted(), labels));
        });

        return res;
    }
}
