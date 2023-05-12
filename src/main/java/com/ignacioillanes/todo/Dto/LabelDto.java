package com.ignacioillanes.todo.Dto;

public class LabelDto {
    private Integer labelId;
    private String name;

    public LabelDto() {
    }

    public LabelDto(Integer labelId, String name) {
        this.labelId = labelId;
        this.name = name;
    }

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
