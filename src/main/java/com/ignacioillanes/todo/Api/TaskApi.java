package com.ignacioillanes.todo.Api;

import com.ignacioillanes.todo.Bl.TaskBl;
import com.ignacioillanes.todo.Dto.ResponseDto;
import com.ignacioillanes.todo.Dto.TaskDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/task")
public class TaskApi {
    @Autowired
    private TaskBl taskBl;

    @GetMapping("")
    public ResponseEntity<ResponseDto<List<TaskDto>>> getAllTasks() {
        ResponseDto<List<TaskDto>> res = new ResponseDto<>();
        res.setCode(0000);
        res.setData(taskBl.getAllTasks());
        res.setMessage("Tasks retrieved successfully");
        return ResponseEntity.ok(res);
    }
}
