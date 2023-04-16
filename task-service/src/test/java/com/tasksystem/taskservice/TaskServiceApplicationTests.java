package com.tasksystem.taskservice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tasksystem.taskservice.DTOs.TaskDTO;
import com.tasksystem.taskservice.model.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@Testcontainers
@AutoConfigureMockMvc
class TaskServiceApplicationTests {

	@Container
	static MongoDBContainer container = new MongoDBContainer(new DockerImageName("mongo:4.4.2"));

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper mapper;

	@DynamicPropertySource
	static void setProperties(DynamicPropertyRegistry registry){
		registry.add("spring.data.mongodb.uri", container::getReplicaSetUrl);
	}

	@Test
	void shouldCreateProduct() throws Exception {

		TaskDTO[] dto = getTaskRequest();

		String value = mapper.writeValueAsString(dto);

		mockMvc.perform(MockMvcRequestBuilders.post("/api/task/create")
				.contentType(MediaType.APPLICATION_JSON)
				.content(value))
				.andExpect(status().isCreated());


	}

	private TaskDTO[] getTaskRequest(){

		TaskDTO[] tasks = new TaskDTO[1];
		tasks[0] = TaskDTO.builder()
				.name("test deneme")
				.point(10)
				.build();
		return tasks;

	}

}
