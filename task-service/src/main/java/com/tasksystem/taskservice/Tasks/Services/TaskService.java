package com.tasksystem.taskservice.Tasks.Services;

import com.tasksystem.taskservice.DTOs.TaskDTO;
import com.tasksystem.taskservice.DTOs.TaskResponseDTO;
import com.tasksystem.taskservice.Repository.TaskRepository.ITaskRepository;
import com.tasksystem.taskservice.Tasks.ITaskService.ITaskService;
import com.tasksystem.taskservice.model.Task;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TaskService implements ITaskService {

    @Autowired
    private final ITaskRepository taskRepository;

    @Override
    public void createTask(TaskDTO[] tasks) {
        for(var task : tasks){
            Task taskEntity = Task.builder()
                    .name(task.getName())
                    .point(task.getPoint())
                    .build();
            this.taskRepository.save(taskEntity);
            log.info("Task {} is created", taskEntity.getId());
        }
    }

    @Override
    public List<TaskResponseDTO> getAll() {
        List<Task> tasks = taskRepository.findAll();
        return tasks.stream().map(this::mapToTaskResponse).toList();
    }

    private TaskResponseDTO mapToTaskResponse(Task task){
        return TaskResponseDTO.builder()
                .id(task.getId())
                .name(task.getName())
                .point(task.getPoint())
                .build();
    }
}
