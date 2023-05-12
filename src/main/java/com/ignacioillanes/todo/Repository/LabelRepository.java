package com.ignacioillanes.todo.Repository;

import com.ignacioillanes.todo.Entity.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LabelRepository extends JpaRepository<Label, Long> {
    @Query(value = "SELECT * FROM label where status = true", nativeQuery = true)
    List<Label> findAllLabels();
}
