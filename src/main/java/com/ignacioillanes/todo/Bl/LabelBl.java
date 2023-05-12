package com.ignacioillanes.todo.Bl;

import com.ignacioillanes.todo.Dao.LabelDao;
import com.ignacioillanes.todo.Dto.LabelDto;
import com.ignacioillanes.todo.Entity.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LabelBl {
    @Autowired
    LabelDao labelDao;

    public List<LabelDto> getAllLabels() {
        List<Label> labels = labelDao.getAllLabels();

        List<LabelDto> res = new ArrayList<>();

        labels.forEach(label -> {
            res.add(new LabelDto(label.getLabelId(), label.getName()));
        });

        return res;
    }
}
