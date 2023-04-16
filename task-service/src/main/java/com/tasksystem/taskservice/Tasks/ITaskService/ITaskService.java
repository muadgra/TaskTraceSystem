package com.tasksystem.taskservice.Tasks.ITaskService;

import com.tasksystem.taskservice.DTOs.TaskDTO;
import com.tasksystem.taskservice.DTOs.TaskResponseDTO;

import java.util.List;

public interface ITaskService {

    public void createTask(TaskDTO[] tasks);

    public List<TaskResponseDTO> getAll();
}
