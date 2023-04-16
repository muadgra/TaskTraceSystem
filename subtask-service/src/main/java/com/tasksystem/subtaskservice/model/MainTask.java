package com.tasksystem.subtaskservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="main-tasks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MainTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String mainTaskNumber;

    private List<Subtask> subtasks;


}
