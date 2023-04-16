package com.tasksystem.subtaskservice.ISubtaskService;

import com.tasksystem.subtaskservice.DTOs.SubtaskCreateDTO;

import java.util.List;

public interface ISubtaskService {
    public void createSubtasks();

    public List<SubtaskCreateDTO> getAll();
}
