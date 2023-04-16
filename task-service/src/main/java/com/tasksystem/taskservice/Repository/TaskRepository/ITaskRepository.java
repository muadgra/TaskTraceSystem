package com.tasksystem.taskservice.Repository.TaskRepository;

import com.tasksystem.taskservice.Repository.IServiceRepository;
import com.tasksystem.taskservice.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ITaskRepository extends MongoRepository<Task, String>{
}
