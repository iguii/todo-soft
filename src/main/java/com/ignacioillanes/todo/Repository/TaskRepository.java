package com.ignacioillanes.todo.Repository;

import com.ignacioillanes.todo.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    @Query(value = "SELECT * FROM task WHERE status = true", nativeQuery = true)
    List<Task> findAllTasks();

}
