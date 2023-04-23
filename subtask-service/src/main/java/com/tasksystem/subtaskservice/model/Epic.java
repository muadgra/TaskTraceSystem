package com.tasksystem.subtaskservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="epics")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Epic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String mainTaskNumber;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Subtask> subtasks;


}
