package com.JrdSpringBootProjects.todoProject.repository;

import com.JrdSpringBootProjects.todoProject.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
