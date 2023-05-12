package com.ignacioillanes.todo.Entity;

import jakarta.persistence.*;

@Entity
public class Label {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="label_id")
    private Integer labelId;

    @Column(name="name")
    private String name;

    @Column(name = "status", columnDefinition = "boolean default true")
    private Boolean status;


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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
