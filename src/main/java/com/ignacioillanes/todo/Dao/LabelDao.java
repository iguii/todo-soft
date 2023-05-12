package com.ignacioillanes.todo.Dao;

import com.ignacioillanes.todo.Entity.Label;
import com.ignacioillanes.todo.Repository.LabelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelDao {
    @Autowired
    LabelRepository labelRepository;

    public List<Label> getAllLabels() {
        return labelRepository.findAllLabels();
    }
}
