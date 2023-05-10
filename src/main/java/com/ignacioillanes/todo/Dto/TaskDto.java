package com.ignacioillanes.todo.Dto;

public class TaskDto {
    private Integer taskId;
    private String description;
    private Boolean completed;

    public TaskDto(Integer taskId, String description, Boolean completed) {
        this.taskId = taskId;
        this.description = description;
        this.completed = completed;
    }

    public TaskDto() {
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
}
