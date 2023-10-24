package com.mbsystems.couchbase711spring.controller;

import com.mbsystems.couchbase711spring.entity.Project;
import com.mbsystems.couchbase711spring.entity.Task;
import com.mbsystems.couchbase711spring.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

    @PostMapping(path = "/save")
    public Project createProject(@RequestBody Project project) {
        return this.projectService.createProject(project);
    }

    @PostMapping(path = "/saveTask")
    public Task creatTask(@RequestBody Task task) {
        return this.projectService.createTask(task);
    }
}
