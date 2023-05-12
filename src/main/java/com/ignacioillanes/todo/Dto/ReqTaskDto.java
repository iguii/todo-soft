package com.ignacioillanes.todo.Dto;

import java.util.List;

public class ReqTaskDto {
    private Integer taskId;
    private String description;
    private Boolean completed;

    private Boolean status;

    public ReqTaskDto() {
    }

    public ReqTaskDto(Integer taskId, String description, Boolean completed, Boolean status) {
        this.taskId = taskId;
        this.description = description;
        this.completed = completed;
        this.status = status;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
