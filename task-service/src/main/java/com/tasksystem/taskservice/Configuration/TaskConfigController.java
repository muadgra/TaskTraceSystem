package com.tasksystem.taskservice.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskConfigController {

    @Autowired
    private TasksServiceConfig config;

    @RequestMapping("/tasks-config")
    public TasksServiceConfig getConfig(){
        return config;
    }
}
