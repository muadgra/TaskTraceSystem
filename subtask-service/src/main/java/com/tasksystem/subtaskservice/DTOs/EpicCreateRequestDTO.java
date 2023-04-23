package com.tasksystem.subtaskservice.DTOs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class EpicCreateRequestDTO {
    public String name;
    public Date startDate;
    public Date expectedEndDate;
    public Date endDate;

}
