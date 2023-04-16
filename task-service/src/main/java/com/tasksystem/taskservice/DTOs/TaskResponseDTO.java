package com.tasksystem.taskservice.DTOs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TaskResponseDTO {

    private String id;
    private String name;
    private Integer point;
}
