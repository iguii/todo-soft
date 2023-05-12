package com.ignacioillanes.todo.Dto;

import java.util.List;

public class TaskDto {
    private Integer taskId;
    private String description;
    private Boolean completed;

    private List<LabelDto> labels;

    public TaskDto() {
    }

    public TaskDto(Integer taskId, String description, Boolean completed, List<LabelDto> labels) {
        this.taskId = taskId;
        this.description = description;
        this.completed = completed;
        this.labels = labels;
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

    public List<LabelDto> getLabels() {
        return labels;
    }

    public void setLabels(List<LabelDto> labels) {
        this.labels = labels;
    }
}
