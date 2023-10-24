package com.mbsystems.couchbase711spring.service;

import com.mbsystems.couchbase711spring.entity.Project;
import com.mbsystems.couchbase711spring.entity.Task;
import com.mbsystems.couchbase711spring.repository.ProjectRepository;
import com.mbsystems.couchbase711spring.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;
    private final TaskRepository taskRepository;

    public Project createProject(Project project) {
        return this.projectRepository.save(project);
    }

    public Task createTask(Task task) {
        return this.taskRepository.save(task);
    }
}
