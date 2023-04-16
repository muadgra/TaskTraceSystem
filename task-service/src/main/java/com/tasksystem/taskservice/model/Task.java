package com.tasksystem.taskservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(value = "task")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Task {
    @Id
    private String id;
    private String name;
    private Integer point;

}
