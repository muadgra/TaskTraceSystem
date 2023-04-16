package com.tasksystem.taskservice.Tasks.Controller;

import com.tasksystem.taskservice.DTOs.TaskDTO;
import com.tasksystem.taskservice.DTOs.TaskResponseDTO;
import com.tasksystem.taskservice.Tasks.Services.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @RequestMapping("/tasks")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TaskResponseDTO> GetTasks(){
        return taskService.getAll();
    }


    @RequestMapping("/create")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createTasks(@RequestBody TaskDTO[] tasks){
        taskService.createTask(tasks);
    }
}
