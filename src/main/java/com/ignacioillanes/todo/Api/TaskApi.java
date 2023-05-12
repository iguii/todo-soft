package com.ignacioillanes.todo.Api;

import com.ignacioillanes.todo.Bl.AuthBl;
import com.ignacioillanes.todo.Bl.TaskBl;
import com.ignacioillanes.todo.Dto.ReqTaskDto;
import com.ignacioillanes.todo.Dto.ResponseDto;
import com.ignacioillanes.todo.Dto.TaskDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/task")
public class TaskApi {
    @Autowired
    private TaskBl taskBl;

    @Autowired
    private AuthBl authBl;


    @GetMapping("")
    public ResponseEntity<ResponseDto<List<TaskDto>>> getAllTasks(
            @RequestHeader("Authorization") String token
    ) {

        if(authBl.isValid(token)){

        }

        ResponseDto<List<TaskDto>> res = new ResponseDto<>();
        res.setCode(0000);
        res.setData(taskBl.getAllTasks());
        res.setMessage("Tasks retrieved successfully");
        return ResponseEntity.ok(res);
    }

    @PostMapping("")
    public ResponseEntity<ResponseDto<TaskDto>> insertTask(
            @RequestBody TaskDto taskDto
            ) {
        ResponseDto<TaskDto> res = new ResponseDto<>();
        res.setCode(0000);
        res.setData(taskBl.insertTask(taskDto));
        res.setMessage("Task inserted successfully");
        return ResponseEntity.status(201).body(res);
    }


}
